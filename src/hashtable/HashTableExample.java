package hashtable;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {

        // Create a HashTable
        Hashtable<String, Integer> hashTable = new Hashtable<>();


        // Add key-value pairs
        hashTable.put("John", 25);
        hashTable.put("Alice", 30);
        hashTable.put("Bob", 35);

        // Retrieve values using keys
        System.out.println("John's age: " + hashTable.get("John"));
        System.out.println("Alice's age: " + hashTable.get("Alice"));
        System.out.println("Bob's age: " + hashTable.get("Bob"));

        // Remove a key-value pair
        hashTable.remove("Alice");

        // Check if a key exists
        System.out.println("Does Alice exist? " + hashTable.containsKey("Alice"));

        // Check if a value exists
        System.out.println("Does age 30 exist? " + hashTable.containsValue(30));

        // Get the size of the HashTable
        System.out.println("Size of HashTable: " + hashTable.size());
    }
}
