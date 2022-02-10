package LeetCode;
import java.util.List;
import java.util.ArrayList;

public class strStr_2 {

    public static int strStr(String haystack, String needle) {

        // Check for Empty Needle
        if(needle.isEmpty()) return 0;
        if(needle.length() > haystack.length()) return -1;

        // Iterate through Characters in Haystack
        for(int i = 0; i < haystack.length(); i++) {

            // Check for Available Space for Comparison
            if((i + needle.length()) > haystack.length()) return -1;

            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) break;
                if(j == needle.length() - 1) return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        System.out.println(strStr("helo", ""));
    }
}
