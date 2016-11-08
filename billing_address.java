package com.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billingaddress")
public class billing_address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int billing_id;
private String street_name;
private String apartment_no;
private String city;
private String state;
private String country;
private String zipcode;

@OneToOne(mappedBy="billingAddress")
private customer customer;

public int getbilling_id() {
	return billing_id;
}

public void setbilling_id(int billing_id) {
	this.billing_id = billing_id;
}

public String getStreet_Name() {
	return street_name;
}

public void setstreet_name(String street_name) {
	this.street_name = street_name;
}

public String getapartment_no() {
	return apartment_no;
}

public void setapartment_no(String apartment_no) {
	this.apartment_no = apartment_no;
}

public String getcity() {
	return city;
}

public void setcity(String city) {
	this.city = city;
}

public String getstate() {
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
