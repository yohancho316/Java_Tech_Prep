package LeetCode;

import java.util.HashMap;

public class IsSubsequence_1 {

    public static boolean isSubsequence(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int pos = 0;

        for(int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))) map.put(t.charAt(i), i);
            else map.put(t.charAt(i), i);
        }

        for(int j = 0; j < s.length(); j++) {
            if(j == 0) {
                if(map.containsKey(s.charAt(j))) {
                    pos = map.get(s.charAt(j));
                    continue;
                } else {
                    return false;
                }
            } else {
                if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > pos) {
                    pos = map.get(s.charAt(j));
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        String t = "caklmbstex";
        System.out.println(isSubsequence(s,t));
    }
}
