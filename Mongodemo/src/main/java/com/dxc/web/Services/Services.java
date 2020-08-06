package com.dxc.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.web.Dao.IDao;
import com.dxc.web.pojos.Book;
@Service
public class Services implements IServices 
{
	@Autowired
	IDao idao;

	public String add(Book b)
	{
		return idao.add(b);
	}

}
