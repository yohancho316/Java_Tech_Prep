package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings_4 {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 1) return true;

        Map<Character,Character> map = new HashMap<Character,Character>();
        Set<Character> set = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) && !set.contains(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            } else if(!map.containsKey(s.charAt(i)) && set.contains(t.charAt(i))) {
                return false;
            } else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
