package com.sbms.bookapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.bookapi.entity.BookEntity;
import com.sbms.bookapi.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepo;

	@Autowired
	public BookServiceImpl(BookRepository bookRepo) {
		// TODO Auto-generated constructor stub
		this.bookRepo = bookRepo;
	}

	@Override
	public String saveBook(BookEntity book) {
		Integer id = book.getBook_id();
		// TODO Auto-generated method stub
		bookRepo.save(book);
		if (id == null) {
			return "recorde inserted";
		} else {
			return "record updated";
		}
	}

	@Override
	public List<BookEntity> getBook() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public String deleteBook(Integer book_id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(book_id);
		return "book deleted";
	}

}
