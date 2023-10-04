package com.demoswagger.service;

import java.util.List;
import java.util.Map;

import com.demoswagger.entity.Book;

public interface BookService {
 public void saveBook(Book book);
 public List<Book> getAllBook();
 public void updateBooks(Map<String,Object> userInputs,Long id) ;
}
