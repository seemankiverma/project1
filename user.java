package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class user {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
private String username;
private String password;
private boolean enabled;
@OneToOne(mappedBy="users")
private customer customer;

public int getuser_id() {
	return user_id;
}
public void setuser_id(int user_id) {
	this.user_id = user_id;
}
public String getusername() {
	return username;
}
public void setusername(String username) {
	this.username = username;
}
public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password = password;
}
public boolean isenabled() {
	return enabled;
}
public void setenabled(boolean enabled) {
	this.enabled = enabled;
}
public static customer getcustomer() {
	return null;
}
public void setcustomer(customer customer) {
	this.customer = customer;
}

}
