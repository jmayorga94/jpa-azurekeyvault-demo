package com.example.keyvaultjpademo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.keyvaultjpademo.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	  List<Customer> findByLastName(String lastName);

	  Optional<Customer> findById(Long id);
	}