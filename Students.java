import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Creating Student class that hold information of students.
 */
public class Students {
    Map<String, List> students;

    public Students() {
        students = new HashMap<>();

    }

    /*
     * Formulate students'record.
     */
    public void add(String firstName, String lastName, String department, String level,
            String hostel, String cgpaRecord) {
        List<String> record = new ArrayList<>();
        record.add(firstName);
        record.add(lastName);
        record.add(department);
        record.add(level);
        record.add(hostel);
        record.add(cgpaRecord);

        students.put(generateStudentNumber(), record);
    }

    public List<String> getStudent(String studentNumber) {
        return students.get(studentNumber);
    }

    /*
     * Print out student record in as a String.
     */

    public void main(String[] args) {
        String firstName = "Mike";
        String lastName = "Olushola";
        String department = "Civil engineering";
        String level = "3rd Year";
        String hostel = "MaryLand Hostel";
        String cpgaRecord = "3.8pt";

        List<String> studentRecord;
        System.out.println(String.join("," studentRecord));




    }
}