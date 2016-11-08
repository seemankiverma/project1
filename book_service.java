package com.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.bookdao_interface;
import com.models.book;

@Service
public class book_service implements book_interface {
	@Autowired
private bookdao_interface bookdao_interface;

	public bookdao_interface getbookdao_interface() {
	return bookdao_interface;
}

public void setbookdao_inteface(bookdao_interface bookDao) {
	this.bookdao_interface = bookDao;
}
@Transactional
	public List<book> getAllBooks() {
		return bookdao_interface.getAllBooks();
	}
public book getBookByIsbn(int isbn) {
	return bookdao_interface.getBookByIsbn(isbn);
}
public void deleteBook(int isbn) {
	bookdao_interface.deleteBook(isbn);
}

public void addBook(book book) {
	bookdao_interface.addBook(book);
	}

public void editBook(book book) {
	bookdao_interface.editBook(book);
	
}

}
