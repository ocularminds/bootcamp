package bootcamp.edu;

public class App {

    public App(){
        System.out.println("Welcome to Admission Unit");
    }

    public void admit(Student student){
        System.out.println(student.getName()+ "admitted");
    }

    public static void main(String[] args){
        App admissions = new App();
        Address address = new Address("1, Toin Street","Goteborg", "Vastra Gotaland");
        Student student = new Student("Tester", address);
        admissions.admit(student);
    }
    
}
