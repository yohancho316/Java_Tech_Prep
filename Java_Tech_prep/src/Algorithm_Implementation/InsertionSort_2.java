package Algorithm_Implementation;

import java.util.Arrays;

public class InsertionSort_2 {

    public static void insertionSort(int[] nums) {

        if(nums.length == 1) {
            return;
        }

        for(int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int[] nums = {100,50,40,60,10,30,90,20,80,70};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}
