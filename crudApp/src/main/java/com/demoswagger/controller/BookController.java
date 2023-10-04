package com.demoswagger.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demoswagger.entity.Book;
import com.demoswagger.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	private BookServiceImpl bookServiceImpl;

	@PostMapping("/addBook")
	public String addNewBook(@RequestBody Book book) {
		bookServiceImpl.saveBook(book);
	   
		return "added successfully";
	}
	
	@GetMapping("/dummy/{fileName}")
	public ResponseEntity<Resource> dummy(@PathVariable String fileName) throws IOException  {
		String path="src/main/resources/"+fileName;
		File file=new File(path);
		
		file.createNewFile();
		 Resource resource= new FileSystemResource(path);
	  
         MediaType contentType = MediaType.parseMediaType("text/csv");

         // Set the content disposition header for attachment and provide a filename
         HttpHeaders headers = new HttpHeaders();
         headers.setContentDispositionFormData("attachment", fileName);
         headers.setContentType(contentType);

         return ResponseEntity.ok()
                 .headers(headers)
                 .body(resource);
	}
	
	@GetMapping("/get-all")
	public List<Book> getAllBooks() {
		return bookServiceImpl.getAllBook();
	}
	@PatchMapping("/update")
	public String updateBooks(@RequestBody Map<String,Object> userInputs,@RequestParam Long id) {
		bookServiceImpl.updateBooks(userInputs,id);
		return "done";
	}
	
}
