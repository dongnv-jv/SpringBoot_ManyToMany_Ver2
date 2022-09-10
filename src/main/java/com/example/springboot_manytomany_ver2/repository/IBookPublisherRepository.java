package com.example.springboot_manytomany_ver2.repository;

import com.example.springboot_manytomany_ver2.entity.Book_Pulisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookPublisherRepository extends JpaRepository<Book_Pulisher,Integer> {
}
