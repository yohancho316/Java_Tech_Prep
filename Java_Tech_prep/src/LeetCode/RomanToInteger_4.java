package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class RomanToInteger_4 {

    public static int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int count = 0;
        int sum = 0;

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        while(count <= s.length() - 2) {
            String str = s.substring(count, count + 2);
            if(map.containsKey(str)) {
                sum += map.get(str);
                count += 2;
            } else {
                sum += map.get(String.valueOf(s.charAt(count)));
                count += 1;
            }
        }

        if(count == s.length()) return sum;
        sum += map.get(String.valueOf(s.charAt(s.length() - 1)));
        return sum;
    }

    public static void main(String[] args) {

    }
}
