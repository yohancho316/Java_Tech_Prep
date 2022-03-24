package LeetCode;
import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate_2 {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int val : nums) {
            if(map.containsKey(val)) {
                return true;
            } else {
                map.put(val,val);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] nums2 = {1,2,3,4,4,5,6};

        System.out.println("Nums 1: " + Arrays.toString(nums));
        System.out.println("Nums1 Contains Duplicate: " + containsDuplicate(nums));
        System.out.println();

        System.out.println("Nums 2: " + Arrays.toString(nums2));
        System.out.println("Nums2 Contains Duplicate: " + containsDuplicate(nums2));
    }
}
