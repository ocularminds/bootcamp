package bootcamp.edu.repository;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bootcamp.edu.dao.Db;
import bootcamp.edu.model.Address;
import bootcamp.edu.model.Student;

public class StudentRepository {
    //CRUDE - create, read, update, delete, 
    List<Student> students;
    final Db db;

    public StudentRepository(final Db db){
      this.db = db;
    }

    /*
     * This creaates new student
     */
    public void add(Student student){
        int id = (int)(Math.random()*1000)+(int)(Math.random()*10000);
        Connection con = null;
        Address address = student.getAddress();
        final String ADDRESSS_SQL = "INSERT INTO addresses(id, street, city, state) VALUES(?, ?, ?, ?)";
        final String STUDENT_SQL= "INSERT INTO students(id, name, address_id) VALUES(?, ?, ?)";
        try{
           con = this.db.connect();
           PreparedStatement ps = con.prepareStatement(ADDRESSS_SQL);
           ps.setInt(1, id);
           ps.setString(2, address.getStreet());
           ps.setString(3, address.getCity());
           ps.setString(4, address.getState());
           ps.execute();

           ps = con.prepareStatement(STUDENT_SQL);
           ps.setInt(1, id);
           ps.setString(2, student.getName());
           ps.setInt(3, id);
           ps.execute();
        } catch(Exception ex){
            ex.printStackTrace();
        } finally {
            this.db.disconnect(con);
        }
    }

    public Student findById(final int id){
        Connection con = null;
        final String sql = "SELECT s.id, s.name, s.address_id, a.street, a.city, a.state "+
                           "FROM students s,addresses a "+
                           "WHERE s.address_id = a.id " +
                           "AND s.id = "+id;
        Student student = null;
        try{
           con = this.db.connect();
           Statement statement = con.createStatement();
           ResultSet result = statement.executeQuery(sql);

           while(result.next()){
            String name = result.getString("name");
            int addressId = result.getInt("address_id");
            String street = result.getString("street");
            String city = result.getString("city");
            String state = result.getString("state");
            Address address = new Address(street, city, state);
            student = new Student(name, address);
            address.setId(addressId);
            student.setId(id);
           }
        } catch(Exception ex){
            ex.printStackTrace();
            return null;
        } finally {
            this.db.disconnect(con);
        }
        return student;
    }

    public List<Student> findAll(){
        Connection con = null;
        final String sql = "SELECT s.id, s.name, s.address_id, a.street, a.city, a.state "+
        "FROM students s,addresses a WHERE s.address_id = a.id";
        List<Student> students = new ArrayList<>();
        try{
           con = this.db.connect();
           Statement statement = con.createStatement();
           ResultSet result = statement.executeQuery(sql);

           while(result.next()){
            int id = result.getInt("id");
            String name = result.getString("name");
            int addressId = result.getInt("address_id");
            String street = result.getString("street");
            String city = result.getString("city");
            String state = result.getString("state");
            Address address = new Address(street, city, state);
            Student student = new Student(name, address);
            address.setId(addressId);
            student.setId(id);
            students.add(student);
           }
        } catch(Exception ex){
            ex.printStackTrace();
            return new ArrayList<>();
        } finally {
            this.db.disconnect(con);
        }
        return students;
    }
/*
 * 1. Find the student with given id
 * 2. if not exist return.
 * 3. otherwise update the address and put back into the collection
 */
    public void update(int id, String street, String city, String state){
        // find by id, extract address id from the student data
    // update address with the id
        final String UPDATE_SQL = "UPDATE addresses SET street = ?, city = ?, state = ? "+
        "WHERE id IN (SELECT address_id from students WHERE id = ?)";
        Connection con = null;
        try{
           con = this.db.connect();
           PreparedStatement ps = con.prepareStatement(UPDATE_SQL);
           ps.setString(1, street);
           ps.setString(2, city);
           ps.setString(3, state);
           ps.setInt(4, id);
           ps.execute();
        } catch(Exception ex){
            ex.printStackTrace();
        } finally {
            this.db.disconnect(con);
        }
    }

    public void delete(int id){
        String sql = "delete from students where id = "+id;
        Connection con = null;
        try{
           con = this.db.connect();
           Statement statement = con.createStatement();
           statement.execute(sql);
        } catch(Exception ex){
            ex.printStackTrace();
        } finally {
            this.db.disconnect(con);
        }
    }

}
