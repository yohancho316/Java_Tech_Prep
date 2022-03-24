package Algorithm_Implementation;
import java.util.Arrays;

public class InsertionSort_1 {

    public static void insertionSort(int[] nums) {
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

        int[] nums = {100, 50, 30, 10, 20, 40, 70, 90, 80, 60};
        System.out.println("Pre Sorted Array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Post Sorted Array: " + Arrays.toString(nums));

    }
}
