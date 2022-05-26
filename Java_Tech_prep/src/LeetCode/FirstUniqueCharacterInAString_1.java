package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharacterInAString_1 {

    public static int firstUniqChar(String s) {

        if(s.length() == 1) return 0;

        HashMap<Character, Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        for(int j = 0; j < s.length(); j++) {
            char curr = s.charAt(j);
            if(map.get(curr) == 1) return j;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "hheellooj";
        System.out.println(firstUniqChar(s));
    }
}
