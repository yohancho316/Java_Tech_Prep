package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_844_1 {

    public static boolean backspaceCompare(String s, String t) {
        if(s.length() == 1 && t.length() == 1) return s == t;
        int s_slow = 0;
        int t_slow = 0;
        int s_fast = 1;
        int t_fast = 1;

        while(s.charAt(0) == '#') {
            s = s.substring(1);
            continue;
        }

        while(t.charAt(0) == '#') {
            t = t.substring(1);
            continue;
        }

        Map<String,Integer> sMap = new HashMap<String,Integer>();
        Map<String,Integer> tMap = new HashMap<String,Integer>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                sMap.put("#", sMap.getOrDefault("#", 0) + 1);
            } else {
                sMap.put("-", sMap.getOrDefault("-", 0) + 1);
            }
        }

        for(int j = 0; j < t.length(); j++) {
            if(t.charAt(j) == '#') {
                tMap.put("#", tMap.getOrDefault("#", 0) + 1);
            } else {
                tMap.put("-", tMap.getOrDefault("-", 0) + 1);
            }
        }

        if(sMap.size() > 1 && sMap.get("#") > sMap.get("-")) return false;
        if(tMap.size() > 1 && tMap.get("#") > tMap.get("-")) return false;

        System.out.println("hello");
        while(s_fast < s.length()) {

            while(s.charAt(0) == '#') {
                s = s.substring(1);
                continue;
            }

            if(s.charAt(s_fast) != '#') {
                ++s_slow;
                ++s_fast;
            } else {
                s = s.substring(0, s_slow) + s.substring(s_fast + 1);
                --s_slow; --s_fast;
            }
        }

        while(t_fast < t.length()) {

            while(t.charAt(0) == '#') {
                t = t.substring(1);
                continue;
            }


            if(t.charAt(t_fast) != '#') {
                ++t_slow;
                ++t_fast;
            } else {
                t = t.substring(0, t_slow) + t.substring(t_fast + 1);
                --t_slow; --t_fast;
            }
        }
        return s.equals(t);
    }

    public static void main(String[] args) {
        String s = "c#a#c";
        String t = "c";
        System.out.println("Equal: " + backspaceCompare(s,t));
    }
}
