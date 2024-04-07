package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mentor {
    @Id
    private String mentorId;

    private String name;

    private String address;
}
