package com.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="bookapp")
public class book
{
	@Id
@Column (name="isbn")
@GeneratedValue (strategy = GenerationType.AUTO)
private int isbn;
@NotEmpty(message="Title is mandatory")
private String title;
//@Column(name="publisher")
@NotEmpty(message="Publication is mendatory")
private String publication;
@Min(value=100,message="Minimum value Shoulb be greter than 100")
private int price;
private String author;
@ManyToOne
@JoinColumn(name="cid")// foregin key column in bookapp table
private category category;
@Transient
private MultipartFile book_img;
public MultipartFile getBook_img() {
	return book_img;
}
public void setbook_img(MultipartFile bookImage) {
	this.book_img = book_img;
}
public int getisbn() {
	return isbn;
}
public void setisbn(int isbn) {
	this.isbn = isbn;
}
public String gettitle() {
	return title;
}
public void settitle(String title) {
	this.title = title;
}
public String getpublication() {
	return publication;
}
public void setpublication(String publication) {
	this.publication = publication;
}
public int getPrice() {
	return price;
}
public void setprice(int price) {
	this.price = price;
}
public String getauthor() {
	return author;
}
public void setauthor(String author) {
	this.author = author;
}
public category getcategory() {
	return category;
}
public void setcategory(category category) {
	this.category = category;
}
public MultipartFile getbook_img() {
	// TODO Auto-generated method stub
	return null;
}

}