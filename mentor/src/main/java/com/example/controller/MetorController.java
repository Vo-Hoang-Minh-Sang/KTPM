package com.example.controller;

import com.example.entity.Mentor;
import com.example.service.MentorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentor")
@RequiredArgsConstructor
public class MetorController {
    @Autowired
    MentorService mentorService;

    @PostMapping("/add")
    public Mentor createMentor(@RequestBody Mentor mentor){
        mentorService.addMentor(mentor);
        return mentor;
    }

    @GetMapping
    public List<Mentor> getMentor(){
        return mentorService.getMentor();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMentor(@PathVariable String id, @RequestBody Mentor mentor){
        mentorService.updateMentor(id, mentor);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMentor(@PathVariable String id){
        mentorService.deleteMentor(id);
        return ResponseEntity.noContent().build();
    }
}
