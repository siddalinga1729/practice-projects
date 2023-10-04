package com.demoswagger.service;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.context.WebApplicationContext;

import com.demoswagger.entity.Book;
import com.demoswagger.repo.BookRepo;


@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;

	@Override
	public void saveBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public void updateBooks(Map<String, Object> userInputs, Long id) {
		if (bookRepo.findById(id).isPresent()) {
			userInputs.forEach((key, value) -> {
					Field field = ReflectionUtils.findField(Book.class, key);
					field.setAccessible(true);
					ReflectionUtils.setField(field, bookRepo.findById(id).get(), value);
			});
			bookRepo.save(bookRepo.findById(id).get());
		}

	}
	public static void main1(String[] args) {
		String str="src/main/resources/";
		File file=new File(str);
		Collection<File> listFiles = FileUtils.listFiles(file,null, false);
		for(File file1 : listFiles) {
			System.out.println(file1);
		}
	}
}
