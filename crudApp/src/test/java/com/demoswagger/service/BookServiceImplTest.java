package com.demoswagger.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demoswagger.entity.Book;
import com.demoswagger.repo.BookRepo;

@SpringBootTest
class BookServiceImplTest {
	@MockBean
	private BookRepo bookRepo;
	@Autowired
	private BookServiceImpl bookService;

	@Test
	void testAddBook() {
		Book book = new Book(1l, "Maths",100);
		
		when(bookRepo.save(book)).thenReturn(book);
		bookService.saveBook(book);
	}
	@Test
	void testgetAllBook() {
		Book book = new Book(1l, "Maths",2000);
		Book book1 = new Book(2l, "Physics",150);
		List<Book> asList = Arrays.asList(book,book1);
		when(bookRepo.findAll()).thenReturn(asList);
		List<Book> allBook = bookService.getAllBook();
		assertEquals(asList, allBook);
	}


}
