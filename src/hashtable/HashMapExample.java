package hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        // Retrieve values using keys
        System.out.println("John's age: " + hashMap.get("John"));
        System.out.println("Alice's age: " + hashMap.get("Alice"));
        System.out.println("Bob's age: " + hashMap.get("Bob"));

        // Remove a key-value pair
        hashMap.remove("Alice");

        // Check if a key exists
        System.out.println("Does Alice exist? " + hashMap.containsKey("Alice"));

        // Check if a value exists
        System.out.println("Does age 30 exist? " + hashMap.containsValue(30));

        // Get All keys with values using Entry Interface
        for (Map.Entry<String, Integer> e: hashMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());
    }
}


