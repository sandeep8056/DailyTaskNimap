package com.boot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.tutorial.modal.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

	
}
