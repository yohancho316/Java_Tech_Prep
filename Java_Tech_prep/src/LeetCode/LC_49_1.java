package LeetCode;

import java.util.*;

public class LC_49_1 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        String[] sorted = new String[strs.length];

        for(int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            sorted[i] = new String(charArr);
        }

        List<List<String>> list = new ArrayList<>();
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < strs.length; i++) {

            // Check if the Current String Already Accounted
            if(set.contains(strs[i])) continue;

            // Add the Current String to the HashSet
            set.add(strs[i]);

            // Instantiate the Temporary String ArrayList
            List<String> tempList = new ArrayList<>();
            tempList.add(strs[i]);

            for(int j = 0; j < strs.length; j++) {
                if((i == j) || (strs[i].length() != strs[j].length())) continue;
                // If the Sorted String Matches Add the Current String to the Used Set & TempList
                if(sorted[j].equals(sorted[i])) {
                    tempList.add(strs[j]);
                    set.add(strs[j]);
                }
            }
            list.add(tempList);
        }

        return list;
    }

    public static void main(String[] args) {

        String[] original = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(original);
        System.out.println(list);
    }
}
