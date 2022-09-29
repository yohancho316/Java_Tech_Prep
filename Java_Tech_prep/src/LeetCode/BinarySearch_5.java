package LeetCode;

import java.util.HashMap;

public class BinarySearch_5 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = ((right - left) / 2) + left;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = --mid;
            else left = ++mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println("Index Pos: " + search(nums, 9));

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(10,1);
        System.out.println("Before Update: " + map.get(10));
        map.put(10,2);
        System.out.println("After Update: " + map.get(10));
    }
}
