package Day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args) {

        // Creating a HashMap with <String, Integer> pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);

        // Retrieving elements from the HashMap
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));
        System.out.println("Value for key 'Three': " + map.get("Three"));
        System.out.println("Value for key 'Four': " + map.get("Four"));

        // Checking if a key exists
        if (map.containsKey("Five"))
            System.out.println("Key 'Five' exists in the map.");
        else
            System.out.println("Key 'Five' does not exist in the map.");

        // Checking if a value exists
        if (map.containsValue(6))
            System.out.println("Value '6' exists in the map.");
        else
            System.out.println("Value '6' does not exist in the map.");

        // Iterating using Iterator
        Iterator<String> i = map.keySet().iterator();
        System.out.println("Iterating using Iterator:");
        while (i.hasNext()) {
            String key = i.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Removing an element from the HashMap
        map.remove("Six");
        System.out.println("After removing key 'Six': " + map);

        // Iterating over the HashMap using for-each and entrySet
        System.out.println("Iterating over the HashMap (entrySet):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Creating a second HashMap with <String, String> pairs
        Map<String, String> hashmap_str = new HashMap<>();

        hashmap_str.put("City1", "India");
        hashmap_str.put("City2", "China");
        hashmap_str.put("City3", "Tokyo");

        // Printing entire map
        System.out.println("String-String HashMap entries: " + hashmap_str.entrySet());

        // Iterating through the String-String HashMap
        for (Map.Entry<String, String> entry : hashmap_str.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " → Value: " + entry.getValue());
        }

        // Uncomment below to clear the map
        // map.clear();
        // hashmap_str.clear();
    }
}
