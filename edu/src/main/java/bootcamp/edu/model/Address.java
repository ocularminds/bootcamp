package bootcamp.edu.model;

public class Address {
    private int id;
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void setId(final int id){
        this.id = id;
    }

    public String getStreet(){
        return this.street;
    }

    public void setStreet(final String street){
        this.street = street;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    @Override
    public String toString(){
        return " -> "+this.street+", "+this.city+", "+this.state;
    }
}
