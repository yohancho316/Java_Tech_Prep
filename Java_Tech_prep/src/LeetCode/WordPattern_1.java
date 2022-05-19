package LeetCode;

import java.util.HashMap;

public class WordPattern_1 {

    public static boolean wordPattern(String pattern, String s) {

        if(s.length() == 1) return true;

        String[] words = s.split(" ");
        HashMap<Character,String> map = new HashMap<Character,String>();

        if(words.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++) {

            char currChar = pattern.charAt(i);
            String currWord = words[i];

            if(map.containsKey(currChar)) {
                if(map.get(currChar).equals(currWord) ) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if(map.containsValue(currWord)) {
                    return false;
                } else {
                    map.put(currChar, currWord);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog rat cat dog";
        System.out.println(wordPattern(pattern, s));


    }
}
