package com.book.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.Address;
@Repository
public interface BookRepository extends  JpaRepository<Address,Integer> {
	


}
