package com.patrick.services;

import com.patrick.data.models.Student;
import com.patrick.data.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements  StudentService{
    private final StudentRepository studentRepository;

    @Override
    public void save(Student patrick) {
        studentRepository.save(patrick);
    }
}
