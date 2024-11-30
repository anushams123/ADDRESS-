package com.book.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.model.Address;
import com.book.demo.service.BookSer;


@RestController
public class BookCon {
	
	@Autowired
	public BookSer book;
	
	@GetMapping("/api/show")
	public List<Address>ShowAllItem()
	   {
		return book.getAllItem();
		}
	@PostMapping("/api/show")
	public Address addAddress(@RequestBody Address add ) 
	{
		return book.saveAddress(add);
	}

}
