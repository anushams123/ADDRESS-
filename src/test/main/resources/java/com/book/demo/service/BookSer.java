package com.book.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.Address;
import com.book.demo.repository.BookRepository;


@Service
public class BookSer {

	@Autowired
	public BookRepository bookRepo;
	public List<Address>getAllItem(){
		return bookRepo.findAll();
	}
	public Address saveAddress(Address address) {
		 return bookRepo.save(address);
	}
		
		
}
