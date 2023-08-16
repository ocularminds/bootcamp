import java.util.Arrays;

public class Functions {
    
    // private, protected
    // + addition
    // - subtraction
    // % modulus(division with remainder only 13%10 3)
    // / division
    // || logical operation
    // | binary logical operation
    // \ Character escape \s(space), \n(Jump to new or next line), 
    // \r(carriage return), \\(backslash), \t(new tab)
    public int add(int a, int b){
      return a + b;
    }

    public double sum(double amount1, double amount2, double interest){
        return amount1 + amount2 + interest;
    }

    public double discountedPrice(double price, double discount, int numberOfShirts){
       double discounted = price * (discount/100);
       //double payment = (price - discounted) * numberOfShirts;
       //return payment;
       return (price - discounted) * numberOfShirts;
    }

    public double getQuadraticRoots(int a, int b, int c){
      // ax^2 + bx + c
      // x1 = (-b+(b^2 - 4ac))/2a
      // x2 = (-b - SQRT(b^2 - 4ac))/2a))
      final int D = b*b - 4*a*c;
      double x1 = (-b + Math.sqrt(D))/(2*a);
      double x2 = (-b - Math.sqrt(D))/(2*a);
      return x1;
    }
    // assignment 1. Write a function to calculate the Check Digit of a Card Number.

    // single line
    /**
     * Multiple line
     * String function split allows to separate characters or string
     * by the separator which be any character or characters
     * 
     * String - length(), split(), toCharArray(), 
     * toLowerCase(), toUpperCase(), join()
     */
    public int getTotalNames(String names){
        System.out.println("\n"+ names);
        System.out.println("Length "+names.length());
        String[] splitNames = names.split(",");
        char[] charsInNames = names.toCharArray();
        System.out.println("Split by ',' "+ Arrays.toString(splitNames));
        System.out.println("All characters in string "+ Arrays.toString(charsInNames));
        System.out.println("In lower case "+ names.toLowerCase());
        System.out.println("In upper case "+ names.toUpperCase());
        String appendix = " - Appendix";
        String joinedString = String.join(names, appendix);
        System.out.println("With appendix "+ joinedString);
        return splitNames.length;
    }

    // more about data types
    // array, set, list, arraylist, map
    // Array is a fixed length order list of items, data, entities, objects
    // It follows a data type with rectanglar brackects
    int[] oddNumbers = new int[5];

    public static void main(String[] args){
        int[] oddNumbers = new int[5];
        //System.out.println("Empty odd numbers: "+ Arrays.toString(oddNumbers));

        oddNumbers[2] = 8;
        oddNumbers[4] = 3;
        oddNumbers[0] = 7;
        System.out.println("Updated odd numbers: "+ Arrays.toString(oddNumbers));
        int[] scores = new int[]{8, 23, 88, 21};
        //System.out.println("Scores: "+ Arrays.toString(scores));
        String[] names = {"Festus", "Shola", "Philomena"};
        System.out.println("Names: "+ Arrays.toString(names));
        // arrays has .length menthod 
        System.out.println("Number of scores: "+ scores.length);
        //System.out.println("Score @position 2: "+ scores[1]+"\n");
        // for-loop for(condition) execute i++, x++, i+2, i+4
        for(int i = 0; i < names.length; i++){
           String name = names[i];
           //System.out.println(name);
        }

        //print scores
        System.out.println("\nPrint scores");
        for(int x = 0; x < scores.length; x++){
          //System.out.println(scores[x]);
        }
        System.out.println("\nPrint scores horizontally");
        for(int x = 0; x < scores.length; x++){
          //System.out.print("\t"+scores[x]);
        }

        Functions functions = new Functions();
        final String testNames = "Sola, Festus, Melat, Philomena";
        functions.getTotalNames(testNames);

    }

    // class 2. Print all scores using for loop
    // Print all oddNumbers in the array using 2-step

    //Strings, Map, Set, List
    // Git 
}
