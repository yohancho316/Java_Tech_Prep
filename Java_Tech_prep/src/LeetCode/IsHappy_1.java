package LeetCode;

import java.util.HashSet;

public class IsHappy_1 {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n != 1) {
            if(set.contains(n)) {
                return false;
            }
            else set.add(n);
            int sum = 0;
            while(n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
}
