Today was awesome!

Git push, git commit, git add, #Update made by Fs
git clone to get a copy of the code from the server

git add . 
git commit -m "whatever you have done"
git push origin -u festus

In Object Oriented programing, everything is an Object!
Anything that can be acted on or refrenced in a problem statement 
is an object.

1. Car hail system. Persengers wait to be driven by a Driver over a 
course of distance and get charged for the service.
- Driver, Rider, Trip, Booking, Trasaction, Car
name, platenumber,ridesCompleted...

2. Ordering App(cake...). A system that allows customers to place
order for a Cake/Pastery and make Payment and have it delivered
- Customer, Order, Item, Payment

- object has properties :name of the properties
Customer - String name, Intger id, String address, String email

public class Customer {
    private String name; 
    private final Integer id;
    private String address;
    private String email;
    
    public Customer(){

    }

    public String Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id id;
    }
}
Polymorphism - Many, methods/functions

Inheritance = Vechicle[tires:4, passengers: 2, stearing: true, speed(), reverse(), doors:2]
              Car[doors: 2]
              SUV[trunk, doors:4]

              HumanBeing - [name, gender, eyes:2, walk(), talk(), respirate()]
              Man[gender:MAN, private, mascline:true], woman

 public class Vehicle {
    int tires;
    int passengers;
    boolean stearing;
    int doors;
    int speed;
    int direction;

    public void accelerate(int torque){
       this.speed = this.speed + torque;// this.speed += torque;
    }

    public void decelerate(int torque){
       this.speed = this.speed - torque;
    }

    public void reverse(int torque){
       this.direction -= torque;
    }
 }

 public class Car extends Vehicle {
    public Car(){
        this.door = 2;
    }
 }


