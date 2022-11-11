package LeetCode;

public class BuddyString_1 {

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() <= 1 || s.length() != goal.length()) return false;

        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = i + 1; j < s.length(); j++) {
                String current = s.substring(0,i) + "" + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1);
                System.out.println(current);
                if(goal.equals(current)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cbad";
        System.out.println(buddyStrings(s,t));
    }

}
