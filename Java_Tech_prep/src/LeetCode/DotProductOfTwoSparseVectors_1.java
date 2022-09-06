package LeetCode;

import java.util.HashMap;

public class DotProductOfTwoSparseVectors_1 {

    public HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    public DotProductOfTwoSparseVectors_1(int[] nums) {


        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                map.put(i, nums[i]);
            }
        }
    }

    public int dotProduct(DotProductOfTwoSparseVectors_1 vec) {

        int sum = 0;

        for(Integer key : map.keySet()) {
            if(vec.map.containsKey(key)) {
                sum += (this.map.get(key) * vec.map.get(key));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        DotProductOfTwoSparseVectors_1 v1 = new DotProductOfTwoSparseVectors_1(new int[] {0,1,0,3});
        DotProductOfTwoSparseVectors_1 v2 = new DotProductOfTwoSparseVectors_1(new int[] {0,5,0,0});

        System.out.println(v1.dotProduct(v2));
    }
}
