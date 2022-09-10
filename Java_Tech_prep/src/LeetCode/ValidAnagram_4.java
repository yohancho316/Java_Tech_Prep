package LeetCode;

import java.util.HashMap;

public class ValidAnagram_4 {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        for(int j = 0; j < t.length(); j++) {
            if(map.containsKey(t.charAt(j))) {
                if((map.get(t.charAt(j)) != null) && (map.get(t.charAt(j)) > 1)) {
                    map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                } else {
                    map.remove(t.charAt(j));
                }
            } else {
                return false;
            }
        }


        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";
        System.out.println(isAnagram(s,t));
    }
}
