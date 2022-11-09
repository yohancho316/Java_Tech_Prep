package LeetCode;

import java.util.Arrays;

public class ValidAnagram_6 {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        for(int i = 0; i < S.length; i++) {
            if(S[i] != T[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hello";
        String t = "llo";
        System.out.println(isAnagram(s,t));
    }
}
