package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindKClosestElements_1 {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Check if k == arr.length
        if(k == arr.length) {
            return Arrays.stream(arr).boxed().collect(Collectors.toList());
        }

        // Declare integer variables
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        // Declare ArrayList Object
        List<Integer> list = new ArrayList<Integer>();

        // Iterate through While Loop
        while(count < k) {

            int left_diff = arr[left] - x;
            int right_diff = arr[right] - x;

            if(left_diff < right_diff) {
                list.add(arr[left]);
                ++count;
                ++left;
            } else if(left_diff > right_diff) {
                list.add(arr[right]);
                ++count;
                --right;
            } else if((left_diff == right_diff) && (arr[left] < arr[right])) {
                list.add(arr[left]);
                ++left;
                ++count;
            } else {
                list.add(arr[right]);
                --right;
                ++count;
            }
        }

        // Sort the ArrayList's Contents
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(findClosestElements(nums, 4, 3));

    }
}
