package bootcamp.edu.repository;

import java.util.List;
import java.util.ArrayList;
import bootcamp.edu.vao.Address;
import bootcamp.edu.vao.Student;

public class Students {
    //CRUDE - create, read, update, delete, 
    List<Student> students;

    public Students(){
      this.students = new ArrayList<>();
    }

    /*
     * This creaates new student
     */
    public void add(Student student){
        int id = students.size() + 1;
        student.setId(id);
        this.students.add(student);
    }

    public Student findById(final int id){
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public List<Student> findAll(){
        return this.students;
    }
/*
 * 1. Find the student with given id
 * 2. if not exist return.
 * 3. otherwise update the address and put back into the collection
 */
    public void update(int id, String street){
        Student student = findById(id);
        if(student == null) return;
        Address address = student.getAddress();
        address.setStreet(street);
        student.setAddress(address);
        students.add(id -1, student);
    }

    public void delete(int id){
        Student student = findById(id);
        if(student == null) return;
        students.add(id-1, null);
    }

}
