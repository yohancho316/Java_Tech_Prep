package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_3_1 {

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        else if(s.length() == 1) return s.length();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int max = Integer.MIN_VALUE;
        int length = 0;
        int pos = 0;
        while(pos < s.length()) {
            if(!map.containsKey(s.charAt(pos))) {
                map.put(s.charAt(pos),pos);
                ++length;
                max = length > max ? length : max;
                ++pos;
            } else {
                pos = map.get(s.charAt(pos)) + 1;
                length = 0;
                map.clear();
            }
        }
        return Math.max(length, max);
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println("max occurs: " + lengthOfLongestSubstring(s));
    }


}
