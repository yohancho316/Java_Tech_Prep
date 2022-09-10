package LeetCode;

import java.util.*;

public class GroupAnagram_2 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String current = strs[i];
            char[] arr = current.toCharArray();
            Arrays.sort(arr);
            current = new String(arr);

            if(map.containsKey(current)) {
                map.get(current).add(strs[i]);
            } else {
                map.put(current, new ArrayList<String>());
                map.get(current).add(strs[i]);
            }
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(strs);
        int count = 1;

        for(List list: lists) {
            System.out.println("Index # " + count++ + ": ");
            for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }

    }
}
