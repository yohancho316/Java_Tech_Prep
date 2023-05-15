package LeetCode;

import java.util.Arrays;

public class AssignCookies_2 {

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = g.length - 1, j = s.length - 1; i >= 0 && j >= 0; i--) {
            if(s[j] >= g[i]) {
                ++count;
                --j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println("Count: " + findContentChildren(g, s));
    }
}
