package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings_2 {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() == 1) return true;

        HashSet<Character> set = new HashSet<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();

        for(int i = 0; i < s.length(); i++) {
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);
            if(map.containsKey(sCurr)) {
                if(map.get(sCurr) == tCurr) continue;
                else return false;
            } else {
                if(set.contains(tCurr)) {
                    return false;
                } else {
                    map.put(sCurr, tCurr);
                    set.add(tCurr);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "fss";
        System.out.println(isIsomorphic(s,t));
    }
}
