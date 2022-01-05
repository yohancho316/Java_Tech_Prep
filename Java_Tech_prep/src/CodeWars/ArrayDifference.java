/*
URL: https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
Difficulty: 6-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */

package CodeWars;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDifference {

    public static int[] arrayDiff_string_method(int[] a, int[] b) {

        if(a.length == 0) {
            return new int[0];
        } else if(b.length == 0) {
            return a;
        }

        // Local Declarations
        HashMap<Integer,Boolean> my_map = new HashMap<>();
        String parsed_string = "";

        // Iterate List B and Input Values into the Hash Map
        for(int i = 0; i < b.length; i++) {
            my_map.put(b[i], true);
        }

        // Iterate List A's Elements to Check if Value Exists as a Key in the Hash Map
        for(int j = 0; j < a.length; j++) {
            if(!(my_map.containsKey(a[j]))) {
                parsed_string += a[j] + " ";
            }
        }

        // Split the String
        String[] string_arr = parsed_string.split(" ");

        // Insert Each String Element into the Integer Array w/ Casting
        int[] return_arr = new int[string_arr.length];
        int index_count = 0;
        for(int k = 0; k < string_arr.length; k++) {
            return_arr[index_count] = Integer.parseInt(string_arr[k]);
            ++index_count;
        }
        return return_arr;
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        // Local Declarations
        HashMap<Integer, Boolean> my_map = new HashMap<>();
        ArrayList<Integer> my_list = new ArrayList<>();

        for(int i = 0; i < b.length; i++) {
            my_map.put(b[i], true);
        }

        for(int j = 0; j < a.length; j++) {
            if(!(my_map.containsKey(a[j]))) {
                my_list.add(a[j]);
            }
        }

        return my_list.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        int[] a = {21, 19, 11, 10, 3, 10, 0, 13, 15, 18, 22, 24, 18, 11, 18, 15, 18, 19, 8, 9, 20, 13, 24, 2, 11, 13, 22, 16, 8, 6, 4, 20, 19, 22, 7, 2, 12, 14, 19, 12, 18};
        int[] b = {22, 19, 21, 14, 13};
        System.out.println(Arrays.toString(arrayDiff_string_method(a,b)));
    }
}
