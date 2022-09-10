package com.example.springboot_manytomany_ver2.entity;

import com.example.springboot_manytomany_ver2.customserializer.CustomBookPublisherSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="publisher_control")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
    @Id
    @Column(name="publisher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="publisher_name")
    private String name;
    @OneToMany(mappedBy = "publisher")
    @JsonSerialize(using = CustomBookPublisherSerializer.class)
    private List<Book_Pulisher> bookPulisherList;

}
