package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.customerdao_interface;
import com.models.customer;

@Service

public abstract class customer_service implements customer_interface
{
	@Autowired
	private customerdao_interface customerdao_inteface;
		
	public customerdao_interface getcustomer_dao() {
		return customerdao_interface.customer;
	}

	public void setcustomer_dao(customerdao_interface customer_dao) {
		this.customerdao_inteface = customer_dao;
	}
	@Transactional
	public void addcustomer(customer customer) {
	customerdao_interface.addCustomer(customer);

	}

	@Override
	public List<customer> getAllCustomers() {
		return customerdao_interface.getAllCustomer();
	}

	@Override
	public customer getcustomerByusername(String username) {
		return customerdao_interface.getCustomerByUsername(username);
	}

	public static com.models.customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}


}
