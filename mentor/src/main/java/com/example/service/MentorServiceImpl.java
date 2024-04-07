package com.example.service;

import com.example.entity.Mentor;
import com.example.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {
    @Autowired
    private MentorRepository mentorRepository;

    @Override
    public Mentor addMentor(Mentor mentor) {
        mentorRepository.save(mentor);
        return mentor;
    }

    @Override
    public List<Mentor> getMentor() {
        return mentorRepository.findAll();
    }

    @Override
    public void updateMentor(String id, Mentor mentor) {
        mentorRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "khong tim thay"));
        mentor.setMentorId(id);
        mentorRepository.save(mentor);
    }

    @Override
    public void deleteMentor(String id) {
        Mentor mentor = mentorRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "khong tim thay"));
        mentorRepository.delete(mentor);
    }
}
