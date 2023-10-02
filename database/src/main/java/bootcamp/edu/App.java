package bootcamp.edu;

import bootcamp.edu.dao.Db;
import bootcamp.edu.service.StudentService;

public class App {

    StudentService studentService;

    public App(){
        System.out.println("----------------------------------");
        System.out.println("|   Welcome to Admission Unit     |");
        System.out.println("----------------------------------");
        Db db = new Db();
        this.studentService = new StudentService(db);
    }

    public void createStudents(){
        //this.studentService.createStudent("Donald Bello", "Teststore 1","Ontario", "CA");
        //this.studentService.createStudent("Tope Samson", "London Avenue 1","Ontario", "CA");
        //this.studentService.createStudent("Jake Kirk", "Teststore 23","Johnsons", "GA");
        this.studentService.print();
    }
    public static void main(String[] args){
        App app = new App();
        app.createStudents();
    }
}