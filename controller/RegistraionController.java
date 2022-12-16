package com.nissan.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nissan.model.Registration;
import com.nissan.service.IRegistrationService;

@RestController
@RequestMapping("api/")
public class RegistraionController<Registartion> {
	@Autowired
	IRegistrationService registrationService;

	// Get all list of UserRegistration http://localhost:9091/api/registrations
	@GetMapping("registrations")
	public List<Registration> listAllRegistartion() {
		return registrationService.findAllRegistration();
	}

	// Post User Registration http://localhost:9091/api/registrations
	@PostMapping("registrations")
	public Registration insertRegistration(@RequestBody Registration registration) {
		return registrationService.addRegistration(registration);
	}
	

	// Get User Registration By Id http://localhost:9091/api/registrations/{id}
	@GetMapping("registrations/{id}")
	public Optional<Registration> searchById(@PathVariable Integer id) {
		return registrationService.searchUsersById(id);
	}

	// Delete User Registration By id http://localhost:9091/api/registrations/{id}
	@DeleteMapping("registrations/{id}")
	public void deletById(@PathVariable Integer id) {
		registrationService.deletRegistrationById(id);
	}

	// Update User Registration by id http://localhost:9091/api/registrations/{id}
	@PutMapping("registrations/{id}")
	public Registration inserprofessorsById(@RequestBody Registration registration, Integer id) {
		// TODO Auto-generated method stub
		return (Registration) registrationService.updateRegistrationById(registration, id);
	}
}
