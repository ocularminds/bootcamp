import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Students{
    
    Map<String,List<String>> students ;

    public Students(){
           students = new HashMap<>();
    }

    public void add(String firstName, String LastName, String department, String number, String cgpa){
       ArrayList<String> studentsRecord = new ArrayList<>();
        studentsRecord.add(firstName);
        studentsRecord.add(LastName);
        studentsRecord.add(department);
        studentsRecord.add(number);
        studentsRecord.add(cgpa);
        students.put(number, studentsRecord);
  }
   public List<String> getStudent(String studentNumber){
        return students.get(studentNumber);
   }
  public List<String> getstudent(String studentNumber){
    List<String> studentInfo = new ArrayList<String>();
     students.put(studentNumber, null);
     return studentInfo;
   }
    public void populate(String firsName,){
    String data = "MTN0001, Festus, Banki, Engineering, 4.32 | MTN0002, Damani, Dada, Sociology, 2.32  | MTN0003, Kuski, Romeo, Science, 3.58\"";
    String[] temData = data.split(" | ");
    String tempdata1 = Arrays.toString(temData);
    String[] maindata = tempdata1.split(" ,  ");
    System.out.println(Arrays.toString(maindata));
    //System.out.println(data[1]);
    }
    public static void main(String[] args) {
        Students st = new Students();
       st.add("Saka","Shola","Maths","Green","3.0");
       //st.populate();

    }
     
 }
    

