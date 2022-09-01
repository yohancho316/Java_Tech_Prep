package LeetCode;

import java.util.HashMap;

public class FibonacciNumber_1 {


    public static int findFib(int n, HashMap<Integer,Integer> map) {
        if(map.containsKey(n)) return map.get(n);
        int result = findFib(n - 1, map) + findFib(n - 2, map);
        map.put(n, result);
        return result;
    }

    public static int fib(int n) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        return findFib(n, map);
    }

    public static void main(String[] args) {
        int n = 6;
        int num = fib(n);
        System.out.println("Fib of " + n + " = " + num);
    }

}
