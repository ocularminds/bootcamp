package bootcamp.edu;

public class Student {
    private String name;
    private Address address;

    public Student(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public Address getAddress(){
        return this.address;
    }
}
