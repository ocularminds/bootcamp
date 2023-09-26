package bootcamp.edu.service;

import java.util.List;
import bootcamp.edu.vao.Address;
import bootcamp.edu.vao.Student;
import bootcamp.edu.repository.Students;

public class StudentService {
    private final Students students;

    public StudentService(){
        this.students = new Students();
    }

    public void createStudent(String name, String street, String city, String state){
        Address address = new Address(street, city, state);
        Student student = new Student(name, address);
        this.students.add(student);
    }

    public void print(){
        System.out.println("\nStudent Records");
        System.out.println("----------------------------------");
        List<Student> records = this.students.findAll();
        for(Student student: records){
            System.out.println(student);
        }
    }
}
