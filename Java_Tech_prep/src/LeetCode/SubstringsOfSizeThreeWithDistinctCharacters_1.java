package LeetCode;

import java.util.HashMap;

public class SubstringsOfSizeThreeWithDistinctCharacters_1 {

    public static int countGoodSubstrings(String s) {
        int unique_count = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        if(s.length() < 3) return 0;

        for(int i = 0; i < 3; i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        if(map.size() == 3) ++unique_count;

        for(int j = 3; j < s.length(); j++) {
            char previous = s.charAt(j - 3);
            char curr = s.charAt(j);

            if(map.get(previous) > 1) {
                map.put(previous, map.get(previous) - 1);
            } else {
                map.remove(previous);
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);

            if(map.size() == 3) ++unique_count;
        }
        return unique_count;
    }

    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }
}
