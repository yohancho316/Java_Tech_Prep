/*
URL: https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java
Difficulty: 5-Kyu
Time Complexity:
Space Complexity:
 */

package CodeWars;

public class WeightForWeight {

//    public static String orderWeight(String strng) {
//
//    }

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
    }
}
