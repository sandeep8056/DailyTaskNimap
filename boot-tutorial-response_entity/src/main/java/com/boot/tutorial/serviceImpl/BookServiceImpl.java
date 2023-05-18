package com.boot.tutorial.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.tutorial.exception.BookNotFoundException;
import com.boot.tutorial.exception.IdNotFoundException;
import com.boot.tutorial.modal.Book;
import com.boot.tutorial.repository.BookRepository;
import com.boot.tutorial.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book getBookById(Integer id) throws IdNotFoundException {
		try {
			Optional<Book> book = bookRepository.findById(id);

			if (book.isEmpty()) {
				throw new IdNotFoundException("Book with this Id is not availaible");
			}
			return book.get();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Book> getAllBooks() throws BookNotFoundException {
		try {
			List<Book> allBook = bookRepository.findAll();
			if (allBook.isEmpty())
				throw new BookNotFoundException("Not any Book found ");

			return allBook;
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		try {
			List<Book> bookByAuthor = bookRepository.findAll().stream()
					.filter(b -> b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());

			return bookByAuthor;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Book> getBookByCategory(String category) throws BookNotFoundException {
		try {
			List<Book> bookByCategory = bookRepository.findAll().stream()
					.filter(book -> book.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
			if (bookByCategory.isEmpty()) {
				throw new BookNotFoundException("Book with given author is not available ");
			}

			return bookByCategory;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String addBook(Book book) throws Exception {

		try {
			Book newBook = new Book();
			newBook.setBookName(book.getBookName());
			newBook.setAuthor(book.getAuthor());
			newBook.setCategory(book.getCategory());
			newBook.setPrice(book.getPrice());

			if (newBook != null) {
				bookRepository.save(newBook);
				return "Book is added successfully";
			}

			return "book is null ";
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public String updateBook(Integer id, Book book) throws BookNotFoundException {

		try {
			Optional<Book> updatebook = bookRepository.findById(id);
			if (updatebook.isEmpty()) {
				throw new BookNotFoundException("No book is availiable by given id ");
			} else {
				Book updatedbook = updatebook.get();
				updatedbook.setAuthor(book.getAuthor());
				updatedbook.setBookName(book.getBookName());
				updatedbook.setCategory(book.getCategory());
				updatedbook.setPrice(book.getPrice());
				bookRepository.save(updatedbook);
				return "book updated successfully";
			}

		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public String deleteBook(Integer id) throws IdNotFoundException {
		
		try {
			Optional<Book> book = bookRepository.findById(id);
			if(book.isEmpty()) {
				throw new IdNotFoundException("Invalid id");
			}
			bookRepository.deleteById(id);
			return "deleted successfully";
		}catch (Exception e) {
			throw e;
		}
		
		
	}
}
