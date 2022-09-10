package com.example.springboot_manytomany_ver2.repository;

import com.example.springboot_manytomany_ver2.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<BookEntity, Integer> {
}
