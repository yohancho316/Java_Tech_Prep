package LeetCode;

import java.util.HashMap;

public class ClimbingStairs_3 {

    public static int findSteps(int n, HashMap<Integer,Integer> map) {
        // Base Case
        if(map.containsKey(n)) return map.get(n);
        int total_steps = findSteps(n - 1, map) + findSteps(n - 2, map);
        map.put(n, total_steps);
        return total_steps;
    }

    public static int climbStairs(int n) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 1);
        map.put(2, 2);
        return findSteps(n, map);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
