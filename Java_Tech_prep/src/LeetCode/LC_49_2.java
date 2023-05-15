package LeetCode;

import java.util.*;

public class LC_49_2 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!map.containsKey(sorted)) {
                map.put(sorted,new ArrayList<String>());
                map.get(sorted).add(strs[i]);
            } else {
                map.get(sorted).add(strs[i]);
            }
        }

        for(String key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
