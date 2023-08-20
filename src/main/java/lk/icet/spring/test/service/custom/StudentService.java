package lk.icet.spring.test.service.custom;

import lk.icet.spring.test.dto.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);

    Student getStudent(Long id);

    List<Student> getAllStudents();
}
