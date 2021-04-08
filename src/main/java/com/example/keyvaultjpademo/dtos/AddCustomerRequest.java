package com.example.keyvaultjpademo.dtos;

public class AddCustomerRequest {

	private String Name;
	private String LastName;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
}
