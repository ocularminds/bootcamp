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
              Lorry[trunk, doors:4]

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

Interface
Car - reverse, accelerate, decelerate, stop, start, steer(RIGHT/LEFT)
     [economy(120, 5, low)midSize(fuel-efficiency), 
     sport(220, 10, high), luxury(180, 5, variable), 
     electric(220, 20, variable), 
     super(280, 30, high), hyper(extreem), suv(size,variable)]

public interface Car {
    void reverse();
    void accelerate(int speed);
    void decelerate(int speed);
    void stop();
    void start();
    void steer(int direction);
}

public class EconomyCar implements Car {

    private int speed;
    private int direction;
    private int speedGain;

    public Car(){
        this.speed = 0;
        this.direction = 0;
        this.speedGain = 2;
    }

    public void reverse(){
       this.direction -= 1;
    }

    void accelerate(int speed){
       this.speed += speedGain;
    }

    void decelerate(int speed){
       this.speed -= speedGain;
    }

    public void stop(){
        this.speed = 0;
    }

    public void start(){
        this.speed = 0;
    }
    
    public void steer(int direction){

    }
}


