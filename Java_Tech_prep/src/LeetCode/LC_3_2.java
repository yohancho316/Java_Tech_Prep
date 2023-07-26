package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_3_2 {

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty() || s == null || s.length() == 1) return s.length();

        int left = 0, right = 0, max = Integer.MIN_VALUE;

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        while(right < s.length()) {

            char curr = s.charAt(right);

            if(map.containsKey(curr)) {
                int count = map.get(s.charAt(left));
                if(count == 1) map.remove(s.charAt(left));
                else map.put(s.charAt(left), count - 1);
                ++left;
            } else {
                map.put(curr, 1);
                ++right;
                max = Math.max(max, right - left);
            }
        }
        return Math.max(max, map.size());
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
