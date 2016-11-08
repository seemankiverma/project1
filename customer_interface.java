package com.services;

import java.util.List;
import com.models.customer;

public interface customer_interface
{
	void addcustomer(customer customer);
	List<customer> getAllCustomers();
	customer getcustomerByUsername(String username);
	customer getcustomerByusername(String username);
}
