package com.example.service;

import com.example.entity.Sutdent;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

//    @Override
//    public void addStudent(Sutdent sutdent) { studentRepository.save(sutdent);}

    @Override
    public List<Sutdent> getAllStudent() {
        return studentRepository.findAll();
    }

//    @Override
//    public void updateStudent(String id, Sutdent sutdent){
//        studentRepository
//                .findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "khong tim thay"));
//        sutdent.setStudentId(id);
//        studentRepository.save(sutdent);
//    }

//    @Override
//    public void deleteStudent(String id){
//        Sutdent sutdent = studentRepository
//                .findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "khong tim thay"));
//        studentRepository.delete(sutdent);
//    }
}
