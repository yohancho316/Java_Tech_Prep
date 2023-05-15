package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_242_1 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(map.get(t.charAt(j)) == null) return false;
            else if((map.get(t.charAt(j)) != null) && (map.get(t.charAt(j)) > 1)) {
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
            } else {
                map.remove(t.charAt(j));
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "car";
        String t = "rrr";
        System.out.println("Anagram: " + isAnagram(s,t));
    }
}
