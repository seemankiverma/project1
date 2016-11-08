package com.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int customerId;
@NotEmpty(message="Customer Name can not be empty")
private String customerName;
@NotEmpty(message="Customer Email can not be empty")
@Column(unique=true)
private String customerEmail;
private String customerPhone;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cartid")
private cart cart;

public cart getcart() {
	return cart;
}
public cart getcustomer() {
	return getcustomer();
}

public void setcart(cart cart) {
	this.cart = cart;
}
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="usersid")
private user user;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="billing_id")
private billing_address billing_address;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="shippingaddressid")
private shipping_address shippinng_address;

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}
public user getuser() {
	return user;
}
public void setuser(user user) {
	this.user = user;
}
public billing_address getbilling_address() {
	return billing_address;
}
public void setbilling_address(billing_address billing_address) {
	this.billing_address = billing_address;
}
public shipping_address getshippinng_address() {
	return shippinng_address;
}
public void setshippinng_address(shipping_address shippinng_address) {
	this.shippinng_address = shippinng_address;
}
}
