package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class authorities {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int authoritiesId;
private String username;
private String authorities;
public int getAuthoritiesId() {
	return authoritiesId;
}
public void setAuthoritiesId(int authoritiesId) {
	this.authoritiesId = authoritiesId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAuthorities() {
	return authorities;
}
public void setAuthorities(String authorities) {
	this.authorities = authorities;
}

}
