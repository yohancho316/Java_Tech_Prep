package LeetCode;

public class LC_169_1 {
    public static int search(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,2,1,0};
        System.out.println("Majority Element: " + search(nums));
    }
}
