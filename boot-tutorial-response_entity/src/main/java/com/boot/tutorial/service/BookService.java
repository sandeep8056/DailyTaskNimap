package com.boot.tutorial.service;

import java.util.List;

import com.boot.tutorial.exception.BookNotFoundException;
import com.boot.tutorial.exception.IdNotFoundException;
import com.boot.tutorial.modal.Book;

public interface BookService {
	
	public Book getBookById(Integer id) throws IdNotFoundException;
	
	public List<Book> getAllBooks() throws BookNotFoundException;
	
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException;
	
	public List<Book> getBookByCategory(String category) throws BookNotFoundException;
	
	public String addBook(Book book) throws Exception;
	
	public String updateBook(Integer id,Book book) throws BookNotFoundException;
	
	public String deleteBook(Integer id) throws IdNotFoundException;

}
