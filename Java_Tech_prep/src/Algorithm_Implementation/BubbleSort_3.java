package Algorithm_Implementation;
import java.util.Arrays;

public class BubbleSort_3 {

    public static int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
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
        int[] nums = {100,40,10,20,50,30,60,90,80,70};
        System.out.println("Pre Sort: " + Arrays.toString(nums));
        nums = bubbleSort(nums);
        System.out.println("Post Sort: " + Arrays.toString(nums));
    }
}
