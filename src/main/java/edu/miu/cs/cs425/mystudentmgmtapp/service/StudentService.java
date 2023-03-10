package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student newStudent);

    Iterable<Student> getAllStudents();


    Student getStudentById(Long studentId);

    Student updateStudentById(Long studentId, Student editedStudent);

    Student updateStudent(Student student);


    void deleteStudentById(Long studentId);

    List<Student> searchStudent(String searchValue);



}
