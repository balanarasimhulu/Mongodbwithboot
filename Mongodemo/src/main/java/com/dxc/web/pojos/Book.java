package com.dxc.web.pojos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Document
public class Book 
{
	@Id
	private int bid;
	private String author;
	public Book() {
		super();
	}
	public Book(int bid, String author) {
		super();
		this.bid = bid;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
