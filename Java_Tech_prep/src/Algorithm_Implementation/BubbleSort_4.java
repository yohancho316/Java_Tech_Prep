package Algorithm_Implementation;
import java.util.Arrays;

public class BubbleSort_4 {

    public static void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {100,50,20,10,40,60,90,30,70,80};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}

// Time Complexity: O(N^2)
// Space Complexity: O(N)
