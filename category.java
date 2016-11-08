package com.models;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.hibernate.annotations.Table;

@Entity
@Table(name="bookcategories")
public class category { // Category has list of Books
@Id
private int category_id;
@Column(name="category")
private String category_name;
@JsonIgnore
@OneToMany(mappedBy="category")
List<book> books;
public int getcategory_id() {
	return category_id;
}
public void setcategory_id(int category_id) {
	this.category_id = category_id;
}
public String getcategory_name() {
	return category_name;
}
public void setcategory_name(String category_name) {
	this.category_name = category_name;
}
public List<book> getbook() {
	return books;
}
public void setbook(List<book> book) {
	this.books = book;
}
}
