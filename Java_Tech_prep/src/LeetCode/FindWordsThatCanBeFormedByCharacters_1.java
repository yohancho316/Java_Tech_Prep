package LeetCode;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters_1 {

    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character,Integer> original = new HashMap<Character,Integer>();
        HashMap<Character,Integer> compare = new HashMap<Character,Integer>();
        for(int i = 0;i < chars.length(); i++) {
            original.put(chars.charAt(i), original.getOrDefault(chars.charAt(i),0) + 1);
            compare.put(chars.charAt(i), compare.getOrDefault(chars.charAt(i),0) + 1);
        }

        for(int j = 0; j < words.length; j++) {

            int length = 0;
            for(int k = 0; k < words[j].length(); k++) {
                if(!compare.containsKey(words[j].charAt(k))) {
                    length = 0;
                    break;
                } else if(compare.containsKey(words[j].charAt(k)) && compare.get(words[j].charAt(k)) > 1) {
                    compare.put(words[j].charAt(k), compare.get(words[j].charAt(k) - 1));
                    length++;
                } else {
                    compare.remove(words[j].charAt(k));
                    ++length;
                }
            }
            sum += length;
            for(Character key: original.keySet()) {
                compare.put(key, original.get(key));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        System.out.println(countCharacters(words, "welldonehoneyr"));
    }
}
