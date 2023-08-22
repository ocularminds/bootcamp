import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Student {
    
    Map<String,List> student ;
    
    public Student(){
           student = new HashMap<>();
    }
    public ArrayList<String> addStudentRecords(String firstName, String LastName, String department, String hostel, String cgpa){
        ArrayList<String> studentsRecord = new ArrayList<>();
        studentsRecord.add(firstName);
        studentsRecord.add(LastName);
        studentsRecord.add(department);
        studentsRecord.add(hostel);
        studentsRecord.add(cgpa);
        return studentsRecord;
        
    }
    public static void main(String[] args) {
        Student st = new Student();
       System.out.println(st.addStudentRecords("Saka","Shola","Maths","Green","3.0"));

    }
     
    
    }
    

