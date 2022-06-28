package LeetCode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters_1 {

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.length() == 1) return 1;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int maxCount = 0;
        int localCount = 0;
        int fast = 0;

        for(; fast < s.length(); fast++) {
            Character curr = s.charAt(fast);
            if(map.containsKey(curr)) {
                fast = map.get(curr);
                map.clear();
                localCount = 0;
                continue;
            } else {
                ++localCount;
                map.put(curr, fast);
            }

            maxCount = Integer.max(localCount, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
