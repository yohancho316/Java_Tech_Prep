package LeetCode;

public class ClimbingStairs_2 {

    public static int climbStairs(int n) {
        int a = 0, b = 1, total_steps = 0;
        for(int i = 1; i <= n; i++) {
            total_steps = a + b;
            a = b;
            b = total_steps;
        }
        return total_steps;
    }

    public static void main(String[] args) {

    }
}
