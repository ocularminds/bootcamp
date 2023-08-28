import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Collections {
    String[] cities;

    public Collections() {
        cities = new String[5];// default object:null, primities 0., boolean:false
    }

    public void createArrays() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] prices = new double[7]; // arrays are zero index1,4,6 = 0th, 3rd, 5th
        String[] names = { "Sola", "Festus", "Melat", "Philomena" };

        System.out.println("Default values:");
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Cities: " + Arrays.toString(cities));
        prices[0] = 45.23;
        prices[3] = 75.00;
        prices[5] = 29.77;

        cities[0] = "Paris";
        cities[1] = "Lagos";
        cities[2] = "Barcelona";
        cities[3] = "Karlskrona";
        cities[4] = "London";

        System.out.println("\nWith new values:");
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Cities: " + Arrays.toString(cities));

    }

    // List, ArrayList, LinkedList, Map, HashMap, Set, HashSet
    // List is a dynamic array
    // ArrayList - get(index), add(Object), remove(int), size()
    public List<String> createCountries() {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Nigeria");
        countries.add("Sweden");
        countries.add("United Kingdom");
        return countries;
    }

    public List<String> remove(int index, List<String> records) {
        records.remove(index);
        return records;
    }

    public static void main(String[] args) {
        Collections collections = new Collections();
        collections.createArrays();

        List<String> countries = collections.createCountries();
        for (int x = 0; x < countries.size(); x++) {
            // System.out.println(countries.get(x));
        }
        System.out.println(" ");
        countries = collections.remove(2, countries);
        for (int x = 0; x < countries.size(); x++) {
            // System.out.println(countries.get(x));
        }
        countries.add("Sweden");
        System.out.println(" ");
        for (int x = 0; x < countries.size(); x++) {
            // System.out.println(countries.get(x));
        }

        // Set keeps a record of unique items
        Set<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(9);
        oddNumbers.add(13);
        oddNumbers.add(21);
        oddNumbers.add(13);
        oddNumbers.add(21);
        oddNumbers.add(21);
        oddNumbers.add(21);
        List<Integer> odds = new ArrayList<>(oddNumbers);
        System.out.println("\nReading contents of Set...");
        System.out.println("Expected Set size to be 7 but was: " + odds.size());
        for (int x = 0; x < odds.size(); x++) {
            // System.out.println(odds.get(x));
        }

        // Map is a key-value pair data storage
        // methods put, get
        // Map<key, value>
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("nigeria", "Abuja");
        countryCapitals.put("sweden", "Stockholm");
        countryCapitals.put("canada", "Ottawa");
        countryCapitals.put("japan", "Tokyo");

        System.out.println("\nCapital city of Japan; " + countryCapitals.get("japan"));
        System.out.println("Country capitals: " + countryCapitals);
    }
}
