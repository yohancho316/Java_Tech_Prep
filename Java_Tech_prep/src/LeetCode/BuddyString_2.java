package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class BuddyString_2 {

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int pos1 = -1; int pos2 = -1;

        // Declare & Instantiate a HashSet Storing Character Type
        Set<Character> set = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                if(pos1 == -1) {
                    pos1 = i;
                } else if(pos2 == -1) {
                    pos2 = i;
                } else return false;
            }
            set.add(s.charAt(i));
        }

        if(pos1 != -1 && pos2 != -1) return s.charAt(pos1) == goal.charAt(pos2) && s.charAt(pos2) == goal.charAt(pos1);
        if(pos1 != -1) return false;
        return set.size() < s.length();
    }

    public static void main(String[] args) {
        String s = "aecd";
        String goal = "abcd";
        System.out.println(buddyStrings(s, goal));
    }
}
