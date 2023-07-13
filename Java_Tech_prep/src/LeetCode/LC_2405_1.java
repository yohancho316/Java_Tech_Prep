package LeetCode;

import java.util.*;

public class LC_2405_1 {

    public static int partitionString(String s) {
        if(s.isEmpty()) return 0;
        Set<Character> set = new HashSet<Character>();
        int occurs = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                ++occurs;
                set.clear();
                set.add(c);
            } else {
                set.add(c);
            }
        }
        return occurs;
    }

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }
}
