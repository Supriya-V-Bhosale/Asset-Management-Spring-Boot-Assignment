package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.Registration;

public interface IRegistrationService {
	// List Of All Registration
	List<Registration> findAllRegistration();

	// Add User Registration
	Registration addRegistration(Registration registration);

	// Search Registration by Id
	Optional<Registration> searchUsersById(Integer id);

	// Delete Registration
	void deletRegistrationById(Integer id);

	// Update Registration
	Registration updateRegistrationById(Registration registration, Integer id);

	

}
