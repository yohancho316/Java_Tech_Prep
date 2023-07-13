package LeetCode;

import java.util.*;

public class LC_1065_1 {

    public Comparator<int[]> comparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] arr1, int[] arr2) {
            int cmp = Integer.compare(arr1[0], arr2[0]);
            if(cmp == 0) {
                return Integer.compare(arr1[1], arr2[1]);
            }
            return Integer.compare(arr1[0], arr2[0]);
        }
    };

    public int[] createLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int left = 0;
        int right = 1;
        while(right < pattern.length()) {
            if(pattern.charAt(left) == pattern.charAt(right)) {
                lps[right] = left + 1;
                ++right;
            } else if(pattern.charAt(left) != pattern.charAt(right) && left > 0) {
                left = lps[left - 1];
            } else if(pattern.charAt(left) != pattern.charAt(right) && left == 0) {
                lps[right] = 0;
                ++right;
            }
        }
        return lps;
    }

    public int[][] indexPairs(String text, String[] words) {
        if(text.isEmpty() || words.length == 0) return null;

        // Create Matrix of Prefix Suffix Arrays for Each
        int[][] lps = new int[words.length][];
        for(int i = 0; i < words.length; i++) {
            lps[i] = createLPS(words[i]);
        }

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            int x = 0;
            int y = 0;
            String pattern = words[i];

            while(x < text.length()) {
                if(text.charAt(x) == pattern.charAt(y)) {
                    ++x; ++y;
                } else if(text.charAt(x) != pattern.charAt(y) && y != 0) {
                    y = lps[i][y - 1];
                } else if(text.charAt(x) != pattern.charAt(y) && y == 0) {
                    ++x;
                }
                if(y == pattern.length()) {
                    list.add(new int[]{x - pattern.length(), x - 1});
                    y = 0;
                    x = x - pattern.length() + 1;
                }
            }

        }

        Collections.sort(list, comparator);
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        String[] words = {"aba", "ab"};

    }
}
