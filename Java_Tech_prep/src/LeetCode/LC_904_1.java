package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_904_1 {

    public static int totalFruit(int[] fruits) {
        if(fruits.length == 1) return fruits.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int left = 0; int right = 0; int maxTrees = 0;
        while(right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2) {
                if(map.get(fruits[left]) == 1) {
                    map.remove(fruits[left]);
                } else {
                    int size = map.get(fruits[left]);
                    map.put(fruits[left], size - 1);
                }
                ++left;
            }
            maxTrees = Math.max(right - left + 1, maxTrees);
            ++right;
        }
        return maxTrees;
    }

    public static void main(String[] args) {
        int[] trees = {1,1,3,2,2,2,2};
        System.out.println("Max Trees: " + totalFruit(trees));
    }
}
