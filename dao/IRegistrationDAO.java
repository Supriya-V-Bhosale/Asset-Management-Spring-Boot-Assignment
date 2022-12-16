package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Registration;

@Repository

public interface IRegistrationDAO extends JpaRepositoryImplementation<Registration, Integer> {
	/*
	 * Inbuilt methods 
	 * findAll() findById save() deletById()
	 */

}
