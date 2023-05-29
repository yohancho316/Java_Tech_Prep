package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FindFirstIndex_1 {

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        else if(needle.length() == haystack.length()) {
            if(haystack.equals(needle)) return 0;
            else return -1;
        }

        Set<String> set = new HashSet<String>();

        for(int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                String subStr = haystack.substring(i,i + needle.length());
                System.out.println("Substring: " + subStr);
                if(set.contains(subStr)) continue;
                else if(needle.equals(subStr)) return i;
                else set.add(subStr);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String needle = "sad";
        String haystack = "sadbutsad";
        System.out.println("Index: " + strStr(haystack, needle));
    }
}
