package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.models.billing_address;
import com.models.customer;
import com.models.shipping_address;
import com.models.user;
import com.services.customer_service;

@Controller
public class registration_controller
{
	@Autowired
	private customer_service customer_services;
	
	public customer_service getcustomer_services() {
		return customer_services;
	}

	public void setcustomer_services(customer_service customer_services) {
		this.customer_services = customer_services;
	}

	@RequestMapping("/customer/registration")
	public ModelAndView getRegistrationForm(){
	customer customer = new customer();
	user user = new user();
	billing_address billing_address = new billing_address();
	shipping_address shipping_address = new shipping_address();
	customer.setuser(user);
	customer.setbilling_address(billing_address);
	customer.setshippinng_address(shipping_address);
	return new ModelAndView("registerCustomer","customer",customer);
}
		
	@RequestMapping(value="/customer/registration",method=RequestMethod.POST)
	public String registerCustomer(@Valid @ModelAttribute(value="customer")customer customer, Model model, BindingResult result)
	{
		
		if(result.hasErrors())
			return "registerCustomer";
		List<customer> customers_list = customer_services.getAllCustomers();
		for(customer c:customers_list){
		
			if(c.getCustomerEmail().equals(customer.getCustomerEmail())){
				model.addAttribute("DuplicateEmail","Email already exists");
				return "registerCustomer";
			}
			if(c.getuser().getusername().equals(customer.getuser().getusername()))
			{
				model.addAttribute("DuplicateUname","Username already exists");
				return"registerCustomer";
			}
		}
		
		customer_services.addcustomer(customer);
		model.addAttribute("registrationSuccess","Registered Successfully. Login using Username & Password");
		return "login";
	}
}
