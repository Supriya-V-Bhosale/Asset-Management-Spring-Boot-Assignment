package com.nissan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IRegistrationDAO;
import com.nissan.model.Registration;

@Service
public class RegistrationServiceImplemention implements IRegistrationService {

	@Autowired
	IRegistrationDAO registrationDAO;

	// Get List of All Registration
	@Override
	public List<Registration> findAllRegistration() {
		// TODO Auto-generated method stub
		return registrationDAO.findAll();
	}

	// Add User Registration
	@Override
	@Transactional
	public Registration addRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return registrationDAO.save(registration);
	}

	// search By User Registration Id
	@Override
	public Optional<Registration> searchUsersById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Registration> registration = registrationDAO.findById(id);
		return registration;
	}

	// Delete By User Registration Id
	@Override
	public void deletRegistrationById(Integer id) {
		// TODO Auto-generated method stub
		registrationDAO.deleteById(id);
	}

	// Update By User Registration Id
	@Override
	public Registration updateRegistrationById(Registration registration, Integer id) {
		// TODO Auto-generated method stub
		return registrationDAO.save(registration);
	}

}
