package LeetCode;

import java.util.HashMap;

public class SubstringsOfSizeThreeWithDistinctCharacters_2 {

    public static int countGoodSubstrings(String s) {

        if(s.length() < 3) return 0;

        int count = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if(i < 3) {
                map.put(current,map.getOrDefault(current,0) + 1);
                continue;
            }

            if(s.length() == 3 && map.size() == 3) return 1;
            if(s.length() == 3 && map.size() != 3) return 0;

            if(map.size() == 3) ++count;

            if(map.get(s.charAt(i - 3)) > 1) map.put(s.charAt(i - 3), map.get(s.charAt(i - 3)) - 1);
            else map.remove(s.charAt(i - 3));

            map.put(current,map.getOrDefault(current,0) + 1);
        }
        if(map.size() == 3) ++count;
        return count;
    }

    public static void main(String[] args) {
        String s = "abbce";
        System.out.println(countGoodSubstrings(s));
    }
}
