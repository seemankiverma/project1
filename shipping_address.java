package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shippingaddress")
public class shipping_address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int shipping_id;
private String street_name;
private String apartment_no;
private String city;
private String state;
private String country;
private String zipcode;

@OneToOne(mappedBy="shippingAddress")
private customer customer;

public int getshipping_id() {
	return shipping_id;
}
public void setshipping_id(int shipping_id) {
	this.shipping_id = shipping_id;
}
public String getstreet_name() {
	return street_name;
}
public void setStreetName(String streetName) {
	this.street_name = street_name;
}
public String getapartment_no() {
	return apartment_no;
}
public void setApartmentNumber(String apartmentNumber) {
	this.apartment_no = apartment_no;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public customer getcustomer() {
	return customer;
}
public void setcustomer(customer customer) {
	this.customer = customer;
}
}
