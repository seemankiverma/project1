package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dao.cartitem_dao_interface;
import com.models.book;
import com.models.cart;
import com.models.cart_item;
import com.models.customer;
import com.services.book_service;
import com.services.cartitem_service;
import com.services.customer_service;

@Controller
public class cartitem_controller {
	@Autowired
	private cartitem_service cartitem_service;
	@Autowired
	private customer_service customer_services;
	@Autowired
	private book_service bookServices;
	private customer_service customer_service;
	
	public cartitem_service getCartItemService() {
		return cartitem_service;
	}
	public void setCartItemService(cartitem_service cartItemService) {
		this.cartitem_service = cartItemService;
	}
	public customer_service getCustomerServices() {
		return getCustomerServices();
	}
	public void setCustomerServices(customer_service customerServices) {
		this.customer_service = customerServices;
	}
	public book_service getBookServices() {
		return bookServices;
	}
	public void setBookServices(book_service bookServices) {
		this.bookServices = bookServices;
	}

	@RequestMapping("/cart/add/{isbn}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void addItem(@PathVariable(value = "isbn") int isbn){
		//Is to get the username of the customer
		//User object contains details about the user -username , password, activeuser or not
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username= user.getUsername();
		customer customer=customer_service.getCustomerByUsername(username);
		System.out.println("Customer is " + customer.getCustomerEmail() );
		cart cart=customer.getcart();	
		
		List<cart_item> cartItems=cart.getcart_item();
		book book=bookServices.getBookByIsbn(isbn);
		for(int i=0;i<cartItems.size();i++){
			cart_item cartItem=cartItems.get(i);
			if(book.getisbn()==cartItem.getbook().getisbn())
			{
				cartItem.setQuantity(cartItem.getQuantity() + 1);
				cartItem.settotal_price(cartItem.getQuantity() * cartItem.getbook().getPrice());
				cartitem_service.addCartItem((cartitem_dao_interface) cartItem);
				return;
			}
		}
		cart_item cartItem=new cart_item();
		cartItem.setQuantity(1);
		cartItem.setbook(book);
		cartItem.settotal_price(book.getPrice() * 1);
		cartItem.setcart(cart);
		cartitem_service.addCartItem(cartItem);
	}
}