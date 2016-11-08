package com.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="cart")
public class cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cart_id;
@OneToOne
@JoinColumn(name="customer_id")
@JsonIgnore
private customer customer;
private double total_price;
@OneToMany(mappedBy="cart",cascade=CascadeType.ALL)
private List<cart_item> cart_item;
public int getcart_id() {
	return cart_id;
}
public void setcart_id(int cart_id) {
	this.cart_id = cart_id;
}
public customer getcustomer() {
	return customer;
}
public void setcustomer(customer customer) {
	this.customer = customer;
}
public double gettotal_price() {
	return total_price;
}
public void settotal_price(double total_price) {
	this.total_price = total_price;
}
public List<cart_item> getcart_item() {
	return cart_item;
}
public void setcart_item(List<cart_item> cart_item) {
	this.cart_item = cart_item;
}
}