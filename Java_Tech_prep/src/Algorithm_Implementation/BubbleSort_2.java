package Algorithm_Implementation;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort_2 {

    public static int[] bubbleSort_Iterative(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < (nums.length - 1) - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {40, 10, 30, 20, 80, 50, 70, 100, 90, 60};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        nums = bubbleSort_Iterative(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}
