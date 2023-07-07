package com.example.mongodbdockerdemo.dao;

import com.example.mongodbdockerdemo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
