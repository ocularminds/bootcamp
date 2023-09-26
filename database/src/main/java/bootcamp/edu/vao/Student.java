package bootcamp.edu.vao;

import bootcamp.edu.vao.Address;

public class Student {

    private Integer id;
    private String name;
    private Address address;

    public Student(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(final int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(final Address address){
        this.address = address;
    }

    @Override
    public String toString(){
       return this.name+" "+this.address.toString();
    }
}
