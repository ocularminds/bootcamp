import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Creating Student class that hold information of students.
 */
public class Students {
    Map<String, List<String>> students;

    public Students() {
        students = new HashMap<>();
    }

    /*
     * Formulate students'record.
     */
    public void add(String firstName, String lastName, String department, String level,
            String number, String cgpa) {
        List<String> record = new ArrayList<>();
        record.add(number);
        record.add(firstName);
        record.add(lastName);
        record.add(department);
        record.add(level);
        record.add(cgpa);

        students.put(number, record);
    }

    public List<String> getStudent(String studentNumber) {
        return students.get(studentNumber);
    }

    /*
     * Print out student record in as a String.
     */

    public void print(List<String> record) {
        for (String item : record) {
            // for(int x = 0; x < record.size(); x++)
            // System.out.println(item);
            System.out.print(item + "\t");
        }
    }

    public static void main(String[] args) {

        Students students = new Students();
        
    }

}