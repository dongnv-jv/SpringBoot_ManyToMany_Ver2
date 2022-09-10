package com.example.springboot_manytomany_ver2.entity;

import com.example.springboot_manytomany_ver2.customserializer.CustomBookPublisherSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book_control")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_title")
    private String title;
    @OneToMany(mappedBy = "bookEntity")
    @JsonSerialize(using = CustomBookPublisherSerializer.class)
    private List<Book_Pulisher> bookPulisherList;

}
