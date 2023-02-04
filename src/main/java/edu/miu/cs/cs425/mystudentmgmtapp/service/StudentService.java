package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;

import java.util.Optional;

public interface StudentService {

    Student saveStudent(Student newStudent);

    Iterable<Student> getAllStudents();

    Optional<Student> getStudentById(Long studentId);

    Student updateStudentById(Long studentId, Student editedStudent);

    void deleteStudentById(Long studentId);


}
