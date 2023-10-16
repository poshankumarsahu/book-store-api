package com.sbms.bookapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.bookapi.entity.BookEntity;
import com.sbms.bookapi.service.BookServiceImpl;

@RestController
public class BookRest {
	
	@Autowired
	private BookServiceImpl bookService;

	@PostMapping("/save")
	public ResponseEntity<String> saveBook(@RequestBody BookEntity bookEntity) {
        String msg = bookService.saveBook(bookEntity);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateBook(@RequestBody BookEntity bookEntity) {
        String msg = bookService.saveBook(bookEntity);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
		String msg = bookService.deleteBook(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<BookEntity>> getBook(){
		List<BookEntity> books = bookService.getBook();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

}
