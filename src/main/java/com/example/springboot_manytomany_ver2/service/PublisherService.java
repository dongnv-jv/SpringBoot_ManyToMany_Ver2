package com.example.springboot_manytomany_ver2.service;

import com.example.springboot_manytomany_ver2.entity.BookEntity;
import com.example.springboot_manytomany_ver2.entity.Publisher;
import com.example.springboot_manytomany_ver2.repository.IPublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private IPublisherRepository iPublisherRepository;

    public List<Publisher> getAllPublisher(){
        return iPublisherRepository.findAll();
    }
    public Publisher addBook(Publisher publisher){
        return iPublisherRepository.save(publisher);
    }

}
