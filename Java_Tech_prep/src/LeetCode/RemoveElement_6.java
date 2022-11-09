package LeetCode;

public class RemoveElement_6 {

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return nums.length;
        int distinct = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[distinct++] = nums[i];
            }
        }
        return distinct;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println("Size: " + removeElement(nums, 2));
    }
}
