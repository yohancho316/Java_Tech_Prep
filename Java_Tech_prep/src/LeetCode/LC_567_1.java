package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_567_1 {

    public static void populateMap(int[] alphabet, Map<Character,Integer> map) {
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] != 0) {
                map.put((char)(i + 97), alphabet[i]);
            }
        }
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int[] alphabet = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            alphabet[(int)curr - 97] += 1;
        }

        boolean flag = false;
        boolean first = true;
        int slow = 0;
        int fast = 0;

        for(;fast < s2.length(); ++fast) {
            char current = s2.charAt(fast);

            if(map.containsKey(current) && first) {
                first = false;
                slow = fast;
                flag = true;
                int occurs = map.get(current);
                if(occurs == 1) map.remove(current);
                else map.put(current, --occurs);
                if(map.isEmpty()) return true;
            } else if(map.containsKey(current)) {
                flag = true;
                int occurs = map.get(current);
                if(occurs == 1) map.remove(current);
                else map.put(current, --occurs);
                if(map.isEmpty()) return true;
            } else {
                fast = slow;
                first = true;
                if(flag) {
                    flag = false;
                    for(int i = 0; i < alphabet.length; i++) {
                        if(alphabet[i] != 0) {
                            map.put((char)(i + 97), alphabet[i]);
                        }
                    }
                }
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println("A permutation of s1 exists in s2: " + checkInclusion(s1, s2));
    }
}
