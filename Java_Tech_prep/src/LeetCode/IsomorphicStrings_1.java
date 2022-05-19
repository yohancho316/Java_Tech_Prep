package LeetCode;

import java.util.HashMap;

public class IsomorphicStrings_1 {

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() == 1) return true;

        HashMap<Character,Character> map = new HashMap<Character,Character>();

        for(int i = 0; i < s.length(); i++) {

            char s_curr = s.charAt(i);
            char t_curr = t.charAt(i);

            if(!map.containsKey(s_curr) && !map.containsValue(t_curr)){
                map.put(s_curr,t_curr);
            }
        }

        String compare = "";

        for(int j = 0; j < s.length(); j++) {
            char curr = s.charAt(j);
            if(!map.containsKey(curr)) {
                return false;
            }
            compare += map.get(curr);
        }

        return compare.equals(t);
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
