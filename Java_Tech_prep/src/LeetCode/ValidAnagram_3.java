package LeetCode;

import java.util.HashMap;

public class ValidAnagram_3 {

    public static boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        for(int j = 0; j < s.length(); j++) {
            char current = s.charAt(j);
            if(map.get(current) == null) return false;
            else if(map.get(current) == 0) map.remove(current);
            else map.put(current, map.get(current) - 1);
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "ccba";
        String t = "abec";
        System.out.println(isAnagram(s,t));
    }
}
