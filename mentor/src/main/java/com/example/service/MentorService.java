package com.example.service;

import com.example.entity.Mentor;

import java.util.List;

public interface MentorService {

    Mentor addMentor(Mentor mentor);

    List<Mentor> getMentor();

    void updateMentor(String id, Mentor mentor);

    void deleteMentor(String id);
}
