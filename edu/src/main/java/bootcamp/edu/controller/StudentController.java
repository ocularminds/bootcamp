package bootcamp.edu.controller;

import bootcamp.edu.model.Student;
import bootcamp.edu.service.StudentService;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
public class StudentController {
    final StudentService studentService;
    public StudentController(final StudentService studentService){
       this.studentService = studentService;
    }

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return  this.studentService.findAll();
    }
    // /studenst/1 - Path Variable
    // /students?id=1 query parameter
    @RequestMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return  this.studentService.findById(id);
    }
    
}
