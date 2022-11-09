package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_5 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(map.containsKey(t.charAt(j)) == false) return false;
            else if(map.get(t.charAt(j)) == 1) map.remove(t.charAt(j));
            else map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
        }

        if(map.isEmpty()) return true;

        return false;
    }

    public static void main(String[] args) {
        String s = "cars";
        String t = "recs";
        System.out.println("Is Anagram: " + isAnagram(s,t));
    }
}
