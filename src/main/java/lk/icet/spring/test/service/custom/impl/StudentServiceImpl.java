package lk.icet.spring.test.service.custom.impl;

import lk.icet.spring.test.dto.Student;
import lk.icet.spring.test.entity.StudentEntity;
import lk.icet.spring.test.repo.custom.StudentRepo;
import lk.icet.spring.test.service.custom.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo repo;
    @Autowired
    ModelMapper modelMapper;
    public void saveStudent(Student student){
        StudentEntity entity = modelMapper.map(student, StudentEntity.class);
        repo.save(entity);
    }

    @Override
    public Student getStudent(Long id) {
        return repo.findById(id).map(entity -> modelMapper.map(entity, Student.class)).orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

}
