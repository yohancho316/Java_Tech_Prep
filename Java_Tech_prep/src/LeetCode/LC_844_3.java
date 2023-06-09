package LeetCode;

public class LC_844_3 {

    public boolean backspaceCompare(String s, String t) {
        if(s.length() == 1 && t.length() == 1) return s.equals(t);
        int x = s.length() - 1; int y = t.length() - 1;
        int sSkip = 0; int tSkip = 0;

        while(x >= 0 && y >= 0) {

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

            if(x < 0 || y < 0) break;
            else if(s.charAt(x) != t.charAt(y)) return false;
            --x; --y;
        }

        sSkip = 0; tSkip = 0;

        while(x >= 0) {
            if(s.charAt(x) == '#') {
                ++sSkip; --x;
            } else if(sSkip > 0) {
                --sSkip; -- x;
            } else return false;
        }

        while(y >= 0) {
            if(t.charAt(y) == '#') {
                ++tSkip; --y;
            } else if(tSkip > 0) {
                --tSkip; --y;
            } else return false;
        }

        if(x < 0 && y < 0) return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
