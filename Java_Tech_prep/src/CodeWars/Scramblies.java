/*
URL: https://www.codewars.com/kata/55c04b4cc56a697bb0000048
Difficulty: 5-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */


package CodeWars;
import java.util.*;
import java.util.HashMap;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        // Local Declarations
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // Iterate through Str1 & Insert Characters into Map1
        for(int i = 0; i < str1.length(); i++) {
            if(map1.containsKey(str1.charAt(i))) {
                int new_count = map1.get(str1.charAt(i)) + 1;
                map1.put(str1.charAt(i), new_count);
            } else {
                map1.put(str1.charAt(i), 1);
            }
        }

        // Iterate through Str2 & Insert Characters into Map2
        for(int j = 0; j < str2.length(); j++) {
            if(map2.containsKey(str2.charAt(j))) {
                int new_count = map2.get(str2.charAt(j)) + 1;
                map2.put(str2.charAt(j), new_count);
            } else {
                map2.put(str2.charAt(j), 1);
            }
        }

        // Iterate through Map2 KeySet & Compare
        for(Character key : map2.keySet()) {
            if(map1.containsKey(key) && (map1.get(key) >= map2.get(key))) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "rkqodlw";
        String word2 = "world";
        System.out.println(scramble(word1, word2));
    }
}
