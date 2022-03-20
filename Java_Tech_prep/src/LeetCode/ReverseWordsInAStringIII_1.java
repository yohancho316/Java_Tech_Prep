package LeetCode;

import java.util.Arrays;

public class ReverseWordsInAStringIII_1 {

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        String reverse = "";

        for(int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            System.out.println(Arrays.toString(word));
            int left = 0;
            int right = word.length - 1;
            while(left < right) {
                Character temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                ++left;
                --right;
            }
            System.out.println(new String(word));
            reverse += new String(word) + " ";
        }
        return reverse.substring(0, (reverse.length() - 1));
    }

    public static void main(String[] args) {
        String s = "hi my name isn't John";
        System.out.println(reverseWords(s));
    }
}
