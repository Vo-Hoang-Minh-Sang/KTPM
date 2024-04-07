package com.example.repository;

import com.example.entity.Sutdent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Sutdent, String> {
}
