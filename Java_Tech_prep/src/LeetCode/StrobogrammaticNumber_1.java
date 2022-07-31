package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class StrobogrammaticNumber_1 {

    public static boolean isStrobogrammatic(String num) {

        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('0','0');
        map.put('1', '1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        String reverse = "";

        for(int i = 0; i < num.length(); i++) {
            if (map.containsKey(num.charAt(i))) {
                reverse = reverse + map.get(num.charAt(i));
            } else {
                return false;
            }
        }

        System.out.println("Reverse: " + reverse);

        int left = 0;
        int right = reverse.length() - 1;

        while(left <= right) {

            System.out.println("Left: " + num.charAt(left));
            System.out.println("Right: " + reverse.charAt(right));
            if(num.charAt(left) == reverse.charAt(right)) {
                ++left;
                --right;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "6";
        System.out.println(isStrobogrammatic(num));
    }
}
