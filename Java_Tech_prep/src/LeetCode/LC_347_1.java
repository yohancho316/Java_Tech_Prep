package LeetCode;

import java.util.*;

public class LC_347_1 {

    public static int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return new int[]{nums[0]};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] arr = new int[k];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        // Invoke HashMap.entrySet() to return a Entry Set of Map.Entry objects
        // Each Map.Entry Object contains the KVP in the original HashMap
        // You can retrieve either the key or value w/ Map.Entry.getKey() / Map.Entry.getValue()
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();

        // Convert the Entry Set to Array List to perform Sorting
        // You must pass the Entry Set object to the ArrayList constructor
        // Otherwise you just create an empty ArrayList that holds Map.Entry Objects
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(entrySet);

        // Sort the list based on values in descending order
        // Use the Collections.sort() method. This works for collection objects of type:
        // 1. List: ArrayList, LinkedList
        // 2. Set: HashSet, TreeSet
        // 3. Queue: PriorityQueue, ArrayQueue
        // 4. Array (Primitive Arrays)
        // We are using the Collections.sort() method to sort an ArrayList of Map.Entry Objects in descending order
        // The Comparator interface in Java is part of the java.util package and is used for custom sorting of objects.
        // It provides a way to define custom comparison logic for objects that do not naturally implement the Comparable interface.
        //The Comparator interface contains a single method called compare(), which compares two objects of the same type
        // and returns an integer value.
        // The compare() method takes two objects as parameters and returns a negative value if the first object should
        // be placed before the second object, a positive value if the first object should be placed after the second
        // object, and zero if the two objects are considered equal in terms of ordering.

        // The sorting behavior is defined using an anonymous inner class that implements the Comparator interface
        // specifically for Map.Entry<Integer, Integer> objects. This allows us to define custom comparison logic for sorting.
        // Within the compare() method of the Comparator, it compares the values of two Map.Entry objects (entry1 and entry2) using the compareTo() method.
        // By subtracting entry1.getValue() from entry2.getValue(), it determines their relative ordering.
        // Returning a negative value indicates that entry2 should come before entry1 in the sorted order, resulting in a descending sort.
        // In simple terms, this code snippet sorts the entryList by comparing the values of each Map.Entry object,
        // ensuring that the list is sorted in descending order based on those values.
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue()); // Sort in descending order
            }
        });

        int pos = 0;

        while(k > 0) {
            arr[k - 1] = entryList.get(pos).getKey();
            --k; ++pos;
        }

        // Iterate through the sorted list
//        for (Map.Entry<Integer, Integer> entry : entryList) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,3,3,3,4,4,4,4,4,4,4,4};
        int[] arr = topKFrequent(nums,2);
        System.out.println(Arrays.toString(arr));
    }
}
