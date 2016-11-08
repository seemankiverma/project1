package com.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.models.authorities;
import com.models.cart;
import com.models.customer;
import com.models.user;

@Repository
public abstract class customer_dao implements customerdao_interface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCustomer(customer customer) {
	
		Session session = sessionFactory.openSession();
		customer.getuser().setenabled(true);
		
		authorities authorities = new authorities(); //Transient heap memory only
		String username = customer.getuser().getusername();
		authorities.setUsername(username);
		authorities.setAuthorities("ROLE_USER");
		
		cart cart = new cart();//new cart
		//It is to set CartId for Customer table
		customer.setcart(cart);//set the cart to the customer
		//if we omit this statement, then it will insert null for customerid in cart
		//to set the customerid in cart table
		cart.setcustomer(customer); 

		session.save(customer);
		session.save(authorities); // persistent(store in database)
		session.flush();
		session.close();
	}

	
	public List<customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		List<customer> customerList = session.createQuery("from Customer").list();
		return customerList;
	}

	public customer getCustomerByUsername(String username) {
		Session session=sessionFactory.openSession();
		//using username - get users details
		Query query=session.createQuery("from Users where username=?");
		query.setString(0, username);
		user users=(user)query.uniqueResult();
		
		//From users get Customer details
		
		customer customer=user.getcustomer();
		return customer;			
	}
}