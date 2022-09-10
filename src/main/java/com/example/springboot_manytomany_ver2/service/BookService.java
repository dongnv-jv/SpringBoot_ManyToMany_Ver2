package com.example.springboot_manytomany_ver2.service;

import com.example.springboot_manytomany_ver2.entity.BookEntity;
import com.example.springboot_manytomany_ver2.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository iBookRepository;

    public List<BookEntity> getAllBook(){
        return iBookRepository.findAll();
    }
    public BookEntity addBook(BookEntity bookEntity){
        return iBookRepository.save(bookEntity);
    }
}
