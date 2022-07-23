package LeetCode;

import java.util.HashMap;

public class ValidAnagram_2 {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 1);
            }
        }

        for(int j = 0; j < t.length(); j++) {
            char curr = t.charAt(j);

            if(map.containsKey(curr)) {
                if(map.get(curr) == 1) {
                    map.remove(curr);
                } else {
                    map.put(curr, map.get(curr) - 1);
                }
            } else {
                return false;
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s = "abcc";
        String t = "ccba";
        System.out.println(isAnagram(s,t));
    }
}
