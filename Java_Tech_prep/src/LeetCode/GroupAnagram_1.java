package LeetCode;

import java.util.*;

public class GroupAnagram_1 {

    public static boolean checkAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(map.containsKey(t.charAt(j))) {
                if((map.get(t.charAt(j)) != null) && (map.get(t.charAt(j)) > 1)) {
                    map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                } else {
                    map.remove(t.charAt(j));
                }
            } else {
                return false;
            }
        }


        return map.isEmpty();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> bigList = new ArrayList<List<String>>();
        HashSet<String> set = new HashSet<String>();

        for(int a = 0; a < strs.length; a++) {
            set.add(strs[a]);
        }

        for(int i = 0; i < strs.length; i++) {

            if(!set.contains(strs[i])) continue;

            List<String> list = new ArrayList<String>();
            list.add(strs[i]);


//            if(strs[i].isEmpty()) {
//                bigList.add(list);
//                continue;
//            }

            for(int j = 0; j < strs.length; j++) {

                if((i == j) || (strs[i].length() != strs[j].length()) || (!set.contains(strs[j]))) {
                    continue;
                }

                boolean isAnagram = checkAnagram(strs[i], strs[j]);

                if(isAnagram == true) {
                    list.add(strs[j]);
                    set.remove(strs[j]);
                }
            }
            set.remove(strs[i]);
            bigList.add(list);
        }

        return bigList;
    }

    public static void main(String[] args) {

        String str = "abcdefg";
        char[] arr = str.toCharArray();
        System.out.println(new String(arr));



//        String[] strs = {"", ""};
//        List<List<String>> list = groupAnagrams(strs);
//        System.out.println("List SIze: " + list.size());
//        int count = 1;
//        for(List arr: list) {
//            System.out.println("Array #" + count++);
//            for(int i = 0; i < arr.size(); i++) {
//                System.out.println("Element: " + arr.get(i));
//            }
//            System.out.println();
//        }


    }
}
