package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences_2 {

    public static boolean uniqueOccurrences(int[] arr) {
        if(arr.length == 1) return true;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        for(Integer key : map.keySet()) {
            if(set.contains(map.get(key))) return false;
            else set.add(map.get(key));
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(uniqueOccurrences(arr));
    }
}
