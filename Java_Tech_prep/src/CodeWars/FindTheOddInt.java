/*
URL: https://www.codewars.com/kata/54da5a58ea159efa38000836/java
Difficulty: 6-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */

package CodeWars;
import java.util.HashMap;

public class FindTheOddInt {

    public static int findOddInt(int[] a) {

        // Local Declarations
        HashMap<Integer, Integer> my_map = new HashMap<>();
        int odd_num = a[0];

        // Iterate through Integer Array & Count Occurrences
        for(int i = 0; i < a.length; i++) {

            // Check if the KVP Already Exists in the Hash Map
            my_map.put(a[i], my_map.getOrDefault(a[i], 0) + 1);
        }

        // Iterate through KeySet to Find Odd Number Occurring Value
        for(int key: my_map.keySet()) {
            if(my_map.get(key) % 2 != 0) {
                System.out.println("Key: " + key + "\t\t Value: " + my_map.get(key));
                odd_num = key;
                break;
            }
        }
        return odd_num;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(findOddInt(a));
    }
}
