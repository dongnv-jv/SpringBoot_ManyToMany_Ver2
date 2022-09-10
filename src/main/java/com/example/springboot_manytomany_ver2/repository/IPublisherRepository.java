package com.example.springboot_manytomany_ver2.repository;

import com.example.springboot_manytomany_ver2.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublisherRepository extends JpaRepository<Publisher,Integer> {
}
