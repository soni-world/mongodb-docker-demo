package com.example.mongodbdockerdemo;

import com.example.mongodbdockerdemo.dao.BookRepository;
import com.example.mongodbdockerdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class MongodbDockerDemoApplication {

    @Autowired
    private BookRepository repo;

    @PostMapping(value = "/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){

        return new ResponseEntity<>(repo.save(book), HttpStatus.OK);

    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Book>> getList(){
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }



    public static void main(String[] args) {
        SpringApplication.run(MongodbDockerDemoApplication.class, args);
    }

}
