package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings_3 {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++) {
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);
            if(map.containsKey(sCurr)) {
                if(map.get(sCurr) != tCurr) return false;
            } else if(set.contains(tCurr)) return false;
            else {
                map.put(sCurr, tCurr);
                set.add(tCurr);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
