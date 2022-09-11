package com.example.springboot_manytomany_ver2.repository;

import com.example.springboot_manytomany_ver2.entity.Book_Pulisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface IBookPublisherRepository extends JpaRepository<Book_Pulisher,Integer> {

    @Query("select u from Book_Pulisher u where u.bookEntity.id=:idBook and u.publisher.id=:idPublisher")
    List<Book_Pulisher> findByBookPublisher(@RequestParam("idBook") int idBook,@RequestParam("idPublisher") int idPublisher);
}
