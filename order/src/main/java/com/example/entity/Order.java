package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "`order`")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private String id;

    private String name;
}
