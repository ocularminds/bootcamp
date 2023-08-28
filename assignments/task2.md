Assignment 2

1. Use Iterator instead of for-loop to print student record
2. Use for-loop to print all student data in Students class. 
   - add a new method display(Map) of all student records 
   - add displayIterator(Map) to use Iterator to display contents of map
3. Modify the quadratic method in Function.java to return an array of double  double[]
  - the return array should be values of x1, x2
4. Given a String containing student records, add a new method in student class to 
populate student records from string.
   - Students.java -> void populate(final String data)
   - data is of the the format:
   "MTN0001, Festus, Banki, Engineering, 4.32 | MTN0002, Damani, Dada, Sociology, 2.32  | MTN0003, Kuski, Romeo, Science, 3.58"
5. Create a folder matching project[orders, uber]
   - Create Objects identified within your project's problem statement
   - Create .java class having the name name as your objects.

   public class Students{

     Map<String, List<String>> students;

     public void add(String number, String firstName, String lastName .....){
        List<String> record = new ArrayList<>();
        record.add(firstName);
        record.add(lastName);
        ...
        students.put(number, record);
     }

    // Given a student number, fecth student record
    public List<String> get(String number){
       List<String> record = students.get(number);
       return record;
    }
    
    public void print(List<String> record){
       String firstName = record.get(0);
       String lastName = record.get(1);
       ...
       System.out.println("First Name: "+ firstName );
       ...
    }

    public static void main(String[] args){
        Students students = new Students();
        students.add("MNS970","Baba", "Festi", "Engineering", "4.75");
        students.add("MNS051","Segun", "Babra", "Computer Science", "5.00");
        ...
        String number = "MNS051";
        List<String> student = students.get(number);
        students.print(student);

    }
}