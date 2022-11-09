package LeetCode;

import java.util.*;

public class MinimumIndexSumOfTwoLists_1 {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null) return null;
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for(int j = 0; j < list2.length; j++) {
            String word = list2[j];
            if(map.containsKey(word)) {
                int currSum = map.get(word) + j;
                if(list.isEmpty()) {
                    list.add(word);
                    minSum = currSum;
                } else if(currSum > minSum) {
                    continue;
                } else if(currSum == minSum){
                    list.add(word);
                } else {
                    list.clear();
                    list.add(word);
                    minSum = currSum;
                }
            } else continue;
        }

        String[] arr = new String[list.size()];
        int x = 0;
        for(int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] s1 = {"happy","sad","good"};
        String[] s2 = {"sad","happy","good"};
        findRestaurant(s1, s2);

    }
}
