package LeetCode;

import java.util.HashMap;

public class RomanToInteger_5 {

    public static int romanToInt(String s) {
        HashMap<String, Integer> map1 = new HashMap<String,Integer>();
        HashMap<String, Integer> map2 = new HashMap<String,Integer>();

        map1.put("I", 1);
        map1.put("V", 5);
        map1.put("X", 10);
        map1.put("L", 50);
        map1.put("C", 100);
        map1.put("D", 500);
        map1.put("M", 1000);

        map2.put("IV", 4);
        map2.put("IX", 9);
        map2.put("XL", 40);
        map2.put("XC", 90);
        map2.put("CD", 400);
        map2.put("CM", 900);

        int sum = 0;
        int i = 0;

        while(i < s.length()) {
            if(((s.length() - i) >= 2) && (map2.containsKey(s.substring(i, i + 2)))) {
                sum += map2.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += map1.get(s.substring(i, i + 1));
                i += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println("Sum: " + romanToInt(s));

    }
}
