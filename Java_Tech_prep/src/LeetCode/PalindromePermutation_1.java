package LeetCode;
import java.util.HashMap;

public class PalindromePermutation_1 {

    public static boolean canPermutePalindrome(String s) {

        int odd_occurrences = 0;
        boolean even_length = (s.length() % 2) == 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        if(s.length() == 1) return true;

        for(int i = 0; i < s.length(); i++) {

            Character current = s.charAt(i);
            if(map.containsKey(current)) {
                map.replace(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        for(Character key : map.keySet()) {
            if(map.get(key) % 2 != 0) {
                ++odd_occurrences;
            }
        }

        if(even_length && odd_occurrences == 0) {
            return true;
        } else if(even_length != true && odd_occurrences == 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(canPermutePalindrome(s));
    }
}
