package com.example.springboot_manytomany_ver2.service;

import com.example.springboot_manytomany_ver2.entity.BookEntity;
import com.example.springboot_manytomany_ver2.entity.Book_Pulisher;
import com.example.springboot_manytomany_ver2.repository.IBookPublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Book_PublisherService {

    @Autowired
    private IBookPublisherRepository iBookPublisherRepository;
    public List<Book_Pulisher> getAllBook_publisher(){
        return iBookPublisherRepository.findAll();
    }
    public Book_Pulisher addBookPulisher(Book_Pulisher Book_Pulisher){
        return iBookPublisherRepository.save(Book_Pulisher);
    }
}
