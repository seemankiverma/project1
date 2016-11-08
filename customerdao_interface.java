package com.dao;

import java.util.List;

import com.models.customer;

public interface customerdao_interface
{
customerdao_interface customer = null;
void addCustomer(customer customer);
List<customer> getAllCustomers();
customer getCustomerByUsername(String username); // ask again it is right or not??
}