package bootcamp.edu.service;

import java.util.List;
import bootcamp.edu.dao.Db;
import bootcamp.edu.model.Address;
import bootcamp.edu.model.Student;
import bootcamp.edu.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository students;

    public StudentService(){
        final Db db = new Db();
        this.students = new StudentRepository(db);
    }

    public void createStudent(String name, String street, String city, String state){
        Address address = new Address(street, city, state);
        Student student = new Student(name, address);
        this.students.add(student);
    }

    public List<Student> findAll(){
        return this.students.findAll();
    }

    public Student findById(final int id){
        return this.students.findById(id);
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
