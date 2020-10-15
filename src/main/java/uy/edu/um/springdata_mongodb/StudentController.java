package uy.edu.um.springdata_mongodb;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    StudentRepository studentRepository;

    @PostMapping("/")
    public void add(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent())
            return studentOptional.get();
        else
            throw new RuntimeException();
    }

}
