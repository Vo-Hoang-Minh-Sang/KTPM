package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Sutdent {

    @Id
    private String studentId;

    private String name;

    private int age;

    private String mentorId;


}
