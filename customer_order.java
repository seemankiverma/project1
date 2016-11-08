package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class customer_order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int customerorder_id;
	@OneToOne
	@JoinColumn(name="cartid")
private cart cart;
	@OneToOne
	@JoinColumn(name="customer_id")
private customer customer;
	@OneToOne
	@JoinColumn(name="billing_id")
private billing_address billing_address;
	@OneToOne
	@JoinColumn(name="shipping_id")
private shipping_address shipping_address;
public int getcustomerorder_id()
{
	return customerorder_id;
}
public void setcustomerorder_id(int customerorder_id) {
	this.customerorder_id = customerorder_id;
}
public cart getcart() {
	return cart;
}
public void setcart(cart cart) {
	this.cart = cart;
}
public customer getcustomer() {
	return customer;
}
public void setcustomer(customer customer) {
	this.customer = customer;
}
public billing_address getbilling_address() {
	return billing_address;
}
public void setbilling_address(billing_address billing_address) {
	this.billing_address = billing_address;
}
public shipping_address getShipping_address() {
	return shipping_address;
}
public void setshipping_address(shipping_address shipping_address) {
	this.shipping_address = shipping_address;
}

}