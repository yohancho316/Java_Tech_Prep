package LeetCode;

public class LC_844_2 {

    public static boolean backspaceCompare(String s, String t) {
        if(s.length() == 1 && t.length() == 1) return s.equals(t);
        int x = s.length() - 1; int y = t.length() - 1;
        int sSkip = 0; int tSkip = 0;

        while(x >= 0 || y >= 0) {

            sSkip = 0; tSkip = 0;

            while(x >= 0) {
                if(s.charAt(x) == '#') {
                    ++sSkip; --x;
                } else if(sSkip > 0) {
                    --sSkip; --x;
                } else break;
            }

            while(y >= 0) {
                if(t.charAt(y) == '#') {
                    ++tSkip; --y;
                } else if(tSkip > 0) {
                    --tSkip; --y;
                } else break;
            }

            if((x >= 0) && (y >= 0) && (s.charAt(x) != t.charAt(y))) {
                return false;
            }

            // Check if x & y are negative (Both are Empty Strings)
            if(x < 0 && y < 0) return true;
            // Check if x >= 0 & y >= 0 (Both have characters remaining to compare)
            else if(x >= 0 && y >= 0) { --x; --y; }
            // Check if S has characters but T is empty
            else if(x >= 0 && y < 0) return false;
            // Check if S is empty but T has characters
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a#bcd###";
        String t = "a#b#c#d#e#f#";
        System.out.println(backspaceCompare(s,t));
    }
}
