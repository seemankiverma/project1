package com.dao;

import java.util.List;

import com.models.book;

public interface bookdao_interface {
List<book> getAllBooks();
book getBookByIsbn(int isbn);
void deleteBook(int isbn);
void addBook(book book);
void editBook(book book);
}

