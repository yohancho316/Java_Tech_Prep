package In_Built_DSA;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        // Create Hash Map Collection Object
        HashMap<String,Integer> hm1 = new HashMap<String,Integer>();

        // Insert KVP into Hash Map
        hm1.put("Hello", 123);
        hm1.put("Hello", 234);

        // Access an Item
        System.out.println(hm1.get("Hello"));

        // Remove an Item
        hm1.remove("Hello");

        // Clear Hash Map Collection
        hm1.clear();

        // Get Size of the Hash map
        System.out.println(hm1.size());

        hm1.put("A", 10);
        hm1.put("B", 20);
        hm1.put("C", 30);
        hm1.put("D", 40);
        hm1.put("E", 50);

        // Iterate through the Hash Map Key Set
        for(String i : hm1.keySet()) {
            System.out.println("Key: " + i + "\t Value: " + hm1.get(i));
        }

        // Iterate through the Hash Map Values
        for(int i : hm1.values()) {
            System.out.println("Value: " + i);
        }

    }
}

/*
1. What is the HashMap In-Built Collection in Java?

    The HashMap collection is an collection object that is used to store key and value pairs, where keys should be unique.
    If you try to insert a duplicate key, it will replace the value associated with that corresponding key.
    The HashMap collection object may only have one "null" key but may contain multiple "null" values.
    The HashMap is a NON-LINEAR Collection as it maintains no particular order.
    Lastly, the HashMap collection object is non-synchronized meaning only one thread can access & manipulate the collection object
    concurrently.

2. Which interface does java.util.HashMap implement?

    java.util.HashMap implements the map interface.
    The map interface provides all the map operations and permits null values and the null key.

3. What are the Benefits of Using the HashMap In-Built Collection?

    The HashMap provides constant-time O(1) performance for the get & put operations.

4. What are the Draw Backs of Using the HashMap In-Built Collection?

    Iteration over collection views requires time proportional to the "capacity" of the HashMap instance (number of buckets) plus
    its size (the number of key-value mappings). Thus, it's very important not to set the initial capacity too high (or the load
    factor too low) if iteration performance is important.

5. What are the two things that affect the performance of a HashMap?

    1. Initial Capacity (Default is Set to 16)
    2. Load Factor (Default is Set to 0.75)

    The capacity refers to the number of buckets in the hash table (size of the underlying array data structure)
    The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
    When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash table
    is rehashed so that the hash table has approximately twice the number of buckets.

6. What are Acceptable Data Types for Keys?
   Keys MUST be objects and if you wish to use primitive data types as keys you must use an equivalent wrapper class.

*/
