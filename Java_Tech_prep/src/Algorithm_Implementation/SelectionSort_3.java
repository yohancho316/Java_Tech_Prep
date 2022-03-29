package Algorithm_Implementation;

import java.util.Arrays;

public class SelectionSort_3 {

    public static void selectionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int minPos = -1;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    minPos = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minPos];
            nums[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {100,50,40,60,10,30,90,20,80,70};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}
