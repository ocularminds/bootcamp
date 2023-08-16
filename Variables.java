//object vs functional
//modifiers - public, private, friendly
// main class, object, functional
// JVM - Java Virtual Machine
public class Variables {
    static final int NUMBER_OF_TIRES = 4;
    int numberOfTires = 2;
    float temprature = 2.0f;
    double amount = 456.23;
    long timestamp = 12344566777890l;
    char alphabet = 'A';
    String alphabetb = "A";
    String name = "Festus";
    boolean started = true;// false
    int allTheColorsOfRainbow = 7;
    final String ROYGBIV = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";
    //public, private, protected
    public void echo(String text){// beginging of block of codes
        System.out.println(text);
    } 
    
    public void println(String text){// beginging of block of codes
        System.out.println("Calling from Variables class: "+ text);
    }
    // method call or execution echo();

    public static void main(String[] args){
        int tires = 8;
       String nameOfSchool = "Cecil Petros School";
       System.out.println("Welcome to Bootcamp");
       System.out.println(" ");
       System.out.println("int Number of Tire: "+ tires);
       System.out.println("String name of school: "+ nameOfSchool);
       Variables variables = new Variables();
       variables.echo("Bootcamp Variables");
       variables.println("Bootcamp Variables");
    }
    
}
