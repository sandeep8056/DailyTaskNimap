package com.boot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorial.modal.Book;
import com.boot.tutorial.serviceImpl.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	private BookServiceImpl bookserviceImpl;

	@GetMapping("/books-by-id/")
	public ResponseEntity<?> getBookById(@RequestParam("id") Integer id) {

		try {
			return new ResponseEntity<>(bookserviceImpl.getBookById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/books")
	public ResponseEntity<?> getAllBook() {
		try {
			return new ResponseEntity<>(bookserviceImpl.getAllBooks(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
	}

	@GetMapping("/books-by-author/")
	public ResponseEntity<?> getBookByAuthor(@RequestParam("author") String author) {

		try {
			return new ResponseEntity<>(bookserviceImpl.getBookByAuthor(author), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/books-by-category/{category}")
	public ResponseEntity<?> getBookByCategory(@RequestParam String category) {

		try {
			return new ResponseEntity<>(bookserviceImpl.getBookByCategory(category), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/books")
	public ResponseEntity<?> addBook(@RequestBody Book book) {
		try {
			return new ResponseEntity<>(bookserviceImpl.addBook(book), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/books/")
	public ResponseEntity<?> updateBook(@RequestParam("id") Integer id, @RequestBody Book book) {
		try {
			return new ResponseEntity<>(bookserviceImpl.updateBook(id, book), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/books/")
	public ResponseEntity<?> deleteBook(@RequestParam("id" )Integer id){
		try {
			return new ResponseEntity<>(bookserviceImpl.deleteBook(id),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}

}
