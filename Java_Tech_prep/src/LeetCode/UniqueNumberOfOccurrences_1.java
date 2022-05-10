package LeetCode;
import java.util.HashMap;

public class UniqueNumberOfOccurrences_1 {


    public static boolean uniqueOccurrences(int[] arr) {

        // Check if the length of the integer array == 1
        if(arr.length == 1) return true;

        // Declare & instantiate a HashMap object
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        // iterate through each element in the array
        for(int i = 0; i < arr.length; i++) {

            // Check if the element already exists as a key in the HashMap
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            // Else insert the KVP into the HashMap
            else {
                map.put(arr[i],1);
            }
        }

        // Iterate through each key in the HashMap's keyset
        for(int key : map.keySet()) {

            int occurs = map.get(key);

            // change the value associated at that given key
            map.put(key, -1);

            // Check if occurs is a value to any key in the HashMap
            if(map.containsValue(occurs)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,1,3,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
