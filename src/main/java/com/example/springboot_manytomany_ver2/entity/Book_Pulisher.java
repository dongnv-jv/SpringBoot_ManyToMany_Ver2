package com.example.springboot_manytomany_ver2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="book_publisher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book_Pulisher {
    @Id
    @Column(name="book_publisher_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @Column(name="date_publish")
    private String date;
    @ManyToOne
    @JoinColumn(name="book_id")
    private BookEntity bookEntity;
    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Publisher  publisher;

}
