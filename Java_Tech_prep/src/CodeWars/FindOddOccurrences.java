/*
URL: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
Difficulty: 6-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */

package CodeWars;
import java.util.*;

public class FindOddOccurrences {

    public static int findOddOccurrences(int[] a) {

        // Local Declarations
        HashMap<Integer,Integer> my_map = new HashMap<>();

        // Check if Array Length == 1
        if(a.length == 1) {
            return a[0];
        }

        // Count Occurrences of Each Number in Array
        for(int i = 0; i < a.length; i++) {
            if(my_map.containsKey(a[i])) {
                my_map.replace(a[i],my_map.get(a[i]) + 1);
            } else {
                my_map.put(a[i],1);
            }
        }

        // Count Occurrence of Each Number in HashMap's KeySet
        for(int key : my_map.keySet()) {
            if(!(my_map.get(key) % 2 == 0)) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, -10, -10, -10, 3, 3, 6, 6, 6, 6};
        System.out.println(findOddOccurrences(arr));
    }
}
