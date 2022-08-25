package LeetCode;

import java.util.HashMap;

public class RansomNote_1 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(int j = 0; j < ransomNote.length(); j++) {
            if (map.containsKey(ransomNote.charAt(j))) {
                if(map.get(ransomNote.charAt(j)) >= 2) {
                    map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j)) - 1);
                } else {
                    map.remove(ransomNote.charAt(j));
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransom = "assdf";
        String magazine = "asdf";
        System.out.println(canConstruct(ransom,magazine));
    }
}
