package com.book.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Address {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phNo;
	private String email;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address(int id, String name, String phNo, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", phNo=" + phNo + ", email=" + email + ", address=" + address
				+ "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
