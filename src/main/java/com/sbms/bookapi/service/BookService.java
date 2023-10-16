package com.sbms.bookapi.service;

import java.util.List;


import com.sbms.bookapi.entity.BookEntity;

public interface BookService {
	
	public String saveBook(BookEntity book);
	
	public List<BookEntity> getBook();
		
	public String deleteBook(Integer book_id);

}
