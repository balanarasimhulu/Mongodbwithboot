package com.dxc.web.repository;


import org.springframework.data.mongodb.repository.MongoRepository;  
import org.springframework.stereotype.Repository;

import com.dxc.web.pojos.Book;

@Repository
public interface Mangodo extends MongoRepository<Book, Integer>
{

	

}
