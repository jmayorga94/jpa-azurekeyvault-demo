package com.example.keyvaultjpademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.keyvaultjpademo.dtos.AddCustomerRequest;
import com.example.keyvaultjpademo.models.Customer;
import com.example.keyvaultjpademo.repositories.CustomerRepository;

@RestController
@RequestMapping(path="/customers")
public class CustomersController {

	 @Autowired
	 private CustomerRepository customerRepository;
	  
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<Customer> getAllUsers() {
	    return customerRepository.findAll();
	  }
	 
	 @PostMapping(path="/add")
	 public @ResponseBody String addNewCustomer (@RequestBody AddCustomerRequest request) {
		 
		 
	   customerRepository.save(new Customer(request.getName(),request.getLastName()));
	  
	   return "saved";
	   
	  }
}
