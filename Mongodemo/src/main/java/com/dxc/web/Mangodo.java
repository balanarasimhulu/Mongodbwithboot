package com.dxc.web;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mangodo extends MongoRepository<Book, Integer>
{

	

}
