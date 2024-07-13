package com.gozdecanki.service;

import com.gozdecanki.model.Student;
import com.gozdecanki.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents(){
   return studentRepository.findAll();
    }

    public Student getStudent(Long id){
        return studentRepository.getReferenceById(id);
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public String  deleteStudent(Long id){
         studentRepository.deleteById(id);

        return "Başarılı";

    }
}
