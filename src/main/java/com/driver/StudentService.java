package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addAStudent(Student student){
        studentRepository.addStudentFromDb(student);
    }

    public void addATeacher(Teacher teacher){
        studentRepository.addTeacherFromDb(teacher);
    }

    public void addAStudentTeacherPair(String student, String teacher){
        studentRepository.addStudentTeacherPairFromDb(student,teacher);
    }

    public Student getAStudentByName(String name){
        return studentRepository.getStudentByNameFromDb(name);
    }

    public Teacher getATeacherByName(String name){
        return studentRepository.getTeacherByNameFromDb(name);
    }

    public List<String> getAStudentsByTeacherName(String teacher){
        return studentRepository.getStudentsByTeacherNameFromDb(teacher);
    }

    public List<String> getAAllStudents(){
        return studentRepository.getAllStudentsFromDb();
    }

    public void deleteATeacherByName(String teacher){
        studentRepository.deleteTeacherByNameFromDb(teacher);
    }

    public void deleteAAllTeachers(){
        studentRepository.deleteAllTeachersFromDb();
    }

}
