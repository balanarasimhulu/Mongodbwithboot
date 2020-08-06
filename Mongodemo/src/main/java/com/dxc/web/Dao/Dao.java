package com.dxc.web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dxc.web.pojos.Book;
import com.dxc.web.repository.Mangodo;
@Repository
@Service
public class Dao implements IDao
{
	@Autowired
	Mangodo mon;
	
	public String add(Book b)
	{
		System.out.println("i am here");
		mon.save(b);
		return "added";
		
	}
	

}
