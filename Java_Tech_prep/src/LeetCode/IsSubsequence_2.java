package LeetCode;

public class IsSubsequence_2 {

    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length() || t == null) return false;

        int pos = 0;
        for(int i = 0; i < s.length(); i++) {
            if(pos == t.length()) return false;
            while(s.charAt(i) != t.charAt(pos)) {
                ++pos;
                if(pos == t.length()) return false;
            }
            ++pos;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
