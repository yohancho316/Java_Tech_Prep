package LeetCode;
import java.util.HashMap;
import java.util.Set;

public class ValidAnagram_1 {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if(map1.containsKey(current)) {
                int occurs = map1.get(current);
                map1.put(current, ++occurs);
            } else {
                map1.put(current, 1);
            }
        }

        for(int j = 0; j < t.length(); j++) {
            Character current = t.charAt(j);
            if(map2.containsKey(current)) {
                int occurs = map2.get(current);
                map2.put(current, ++occurs);
            } else {
                map2.put(current, 1);
            }
        }

        for(Character key : map1.keySet()) {
            if((!map2.containsKey(key)) || (map1.get(key) != map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rastt";
        String t = "ttar";
        System.out.println(isAnagram(s,t));
    }
}
