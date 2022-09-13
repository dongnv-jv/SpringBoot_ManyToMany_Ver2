package com.example.springboot_manytomany_ver2.service;

import com.example.springboot_manytomany_ver2.entity.BookEntity;
import com.example.springboot_manytomany_ver2.exceptionhandle.ExceptionNotFound;
import com.example.springboot_manytomany_ver2.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<BookEntity> getBookById(Integer id) throws ExceptionNotFound {
        Optional<BookEntity> bookEntityOptional= iBookRepository.findById(id);
        if(bookEntityOptional.isPresent()){
            return bookEntityOptional;
        } else
            throw new ExceptionNotFound("Book ID = "+id+" is not registered !");
    }

    public BookEntity updateBook(BookEntity bookEntity) throws Exception {
        Optional<BookEntity> bookEntityOptional= this.getBookById(bookEntity.getId());
        if(bookEntityOptional.isPresent()){
            return iBookRepository.save(bookEntity);
        } else
            throw new ExceptionNotFound("Book ID = "+bookEntity.getId()+" is not registed !");
    }
}
