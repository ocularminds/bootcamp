package bootcamp.edu.controller;

import bootcamp.edu.model.Address;
import bootcamp.edu.model.Student;
import bootcamp.edu.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
//studensts, /students/3
@RequestMapping("/students")
public class StudentController {
    final StudentService studentService;

    public StudentController(final StudentService studentService){
       this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return  this.studentService.findAll();
    }
    // /students/1 - Path Variable    HTTP Verbs - GET, POST, PUT, DELETE, HEAD - Idempotent
    // /students?id=1 query parameter
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return  this.studentService.findById(id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Student student){
        final String name = student.getName();
        final Address address = student.getAddress();
        this.studentService.createStudent(name,  address.getStreet(),  address.getCity(),  address.getState());
        return ResponseEntity.ok("Student record created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") int id){
     return ResponseEntity.ok("Student record created");
    }
    
}
