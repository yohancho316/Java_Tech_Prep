package Algorithm_Implementation;

import java.util.Arrays;

public class SelectionSort_2 {

    public static void selectionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int min_val = Integer.MAX_VALUE;
            int min_index = -1;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min_val) {
                    min_val = nums[j];
                    min_index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nums = {100,50,20,10,40,60,90,30,70,80};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}

// Time Complexity: O(N^2)
// Space Complexity: O(N)
