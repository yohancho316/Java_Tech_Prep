/*
URL: https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
Difficulty: 5-Kyu
Time Complexity: O(N^2) or Quadratic
Space Complexity: O(N)
 */

package CodeWars;
import java.util.Arrays;

public class WeightForWeight {

    public static int calcWeight(String val) {
        int sum = 0;
        for(int i = 0; i < val.length(); i++) sum += Integer.parseInt(String.valueOf(val.charAt(i)));
        return sum;
    }

    public static String orderWeight(String strng) {

        // Local Declarations
        String[] string_arr = strng.split(" ");

        // Use Bubble Sort to Sort the Array by Weight or Lexicographical Order
        for(int i = 0; i < string_arr.length; i++) {
            for(int j = 1; j < string_arr.length - i; j++) {
                int current = calcWeight(string_arr[j]);
                int previous = calcWeight(string_arr[j - 1]);

                if(previous > current) {
                    String temp = string_arr[j];
                    string_arr[j] = string_arr[j - 1];
                    string_arr[j - 1] = temp;
                } else if((previous == current) && (string_arr[j - 1].compareTo(string_arr[j]) > 0)) {
                    String temp = string_arr[j];
                    string_arr[j] = string_arr[j - 1];
                    string_arr[j - 1] = temp;
                }
            }
        }

        String return_string = "";

        for(int i = 0; i < string_arr.length; i++) {
            return_string += string_arr[i] + " ";
        }

        return return_string.substring(0, return_string.length() - 1);
    }

    public static void main(String[] args) {
        String x = "180";
        String y = "90";

        // How to Compare Lexicographically
        if(x.compareTo(y) > 0) {
            System.out.println(x + " > " + y);
        } else if(x.compareTo(y) < 0) {
            System.out.println(x + " < " + y);
        } else {
            System.out.println(x + " == " + y);
        }

        System.out.println("\n\n");
        String list = "103 123 4444 99 2000";
        System.out.println("Original List: " + list);
        System.out.println("Ordered List: " + orderWeight(list));
    }
}
