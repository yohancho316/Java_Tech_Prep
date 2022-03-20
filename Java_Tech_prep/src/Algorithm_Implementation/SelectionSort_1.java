package Algorithm_Implementation;

import java.util.Arrays;

public class SelectionSort_1 {

    public static int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int min_index = Integer.MAX_VALUE;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    min_index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {100,40,10,20,50,30,60,90,80,70};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        nums = selectionSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}
