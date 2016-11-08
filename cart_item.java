package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_item")
public class cart_item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cartitem_id;
private int quantity;
private double total_price;
@ManyToOne
@JoinColumn(name="productId")
private book book;
@ManyToOne
@JoinColumn(name="cartid")
private cart cart;
public int getcaartitem_id() {
	return cartitem_id;
}
public void setCartItemId(int cartItemId) {
	this.cartitem_id = cartitem_id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public book getbook() {
	return book;
}
public void setbook(book book) {
	this.book = book;
}
public cart getcart() {
	return cart;
}
public void setcart(cart cart) {
	this.cart = cart;
}
public double gettotal_price() {
	return total_price;
}
public void settotal_price(double total_price) {
	this.total_price = total_price;
}

}
