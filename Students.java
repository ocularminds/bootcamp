import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Students{
    
    Map<String,List> students ;
    
    public Students(){
           students = new HashMap<>();
    }
    public void add(String firstName, String LastName, String department, String hostel, String cgpa){
        ArrayList<String> studentsRecord = new ArrayList<>();
        studentsRecord.add(firstName);
        studentsRecord.add(LastName);
        studentsRecord.add(department);
        studentsRecord.add(hostel);
        studentsRecord.add(cgpa);
        
  }
  public List<String> getstudent(String studentNumber){
    List<String> studentInfo = new ArrayList<String>();
     students.put(studentNumber, null);
     return studentInfo;

  }
    public static void main(String[] args) {
        Students st = new Students();
       st.add("Saka","Shola","Maths","Green","3.0");

    }
     
 }
    

