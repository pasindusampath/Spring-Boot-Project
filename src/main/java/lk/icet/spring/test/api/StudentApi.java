package lk.icet.spring.test.api;

import lk.icet.spring.test.dto.Student;
import lk.icet.spring.test.service.custom.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentApi {
    @Autowired
    private StudentService service;
    @PostMapping
    public void saveStudent(@RequestBody Student student){
        System.out.println("Request Came");
        service.saveStudent(student);
        System.out.println("Request Done");
    }

    @GetMapping
    public Student getStudent(@RequestParam Long id){
        return service.getStudent(id);
    }

    @GetMapping("/{name}")
    public List<Student> getByName(@PathVariable String name){
        return service.findByFirstName(name);
    }
}
