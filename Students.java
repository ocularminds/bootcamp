import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.MediaSize.Engineering;

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

        record.add(firstName);
        record.add(lastName);
        record.add(department);
        record.add(number);
        record.add(level);
        record.add(cgpa);

        students.put(number, record);
    }

    /*
     * Print out student record on line, as a String.
     */

    // public void print(List<String> record) {
    // for (String item : record) {
    // // for(int x = 0; x < record.size(); x++)
    // System.out.println(item);
    // System.out.print(item + "\t");
    // }
    // }

    /*
     * Given a student number, fetch student's record.
     */
    public List<String> get(String number) {
        List<String> record = students.get(number);
        return record;
    }

    public void print(List<String> record) {
        String firstName = record.get(0);
        String lastName = record.get(1);
        String department = record.get(2);
        String number = record.get(3);
        String level = record.get(4);
        String cgpa = record.get(5);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Number: " + number);
        System.out.println("Level: " + level);
        System.out.println("CGPA: " + cgpa);

    }

    public static void main(String[] args) {
        Students students = new Students();
        students.add("Baba", "Festi", "Engineering", "Year 2", "ENG051", "3.28");
        students.add("Ade", "Makinde", "Computer Science", "Year 3", "SCN342", "4.28");
        students.add("Mike", "Taliban", "Computer Science", "Year 2", "SCN042", "2.20");

        String number = "SCN342";
        List<String> student = students.get(number);
        students.print(student);

    }

}