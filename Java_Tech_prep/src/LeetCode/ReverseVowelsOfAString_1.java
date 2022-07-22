package LeetCode;

public class ReverseVowelsOfAString_1 {

    public static String reverseVowels(String s) {
        if(s.length() == 1) return s;
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if(arr[left] != 'a' && arr[left] != 'A' && arr[left] != 'e' && arr[left] != 'E' && arr[left] != 'i' && arr[left] != 'I' && arr[left] != 'o' && arr[left] != 'O' && arr[left] != 'u' && arr[left] != 'U') {
                ++left;
                System.out.println("Skip Left");
                continue;
            }
            if (arr[right] != 'a' && arr[right] != 'A' && arr[right] != 'e' && arr[right] != 'E' && arr[right] != 'i' && arr[right] != 'I' && arr[right] != 'o' && arr[right] != 'O' && arr[right] != 'u' && arr[right] != 'U') {
                --right;
                System.out.println("Skip Right");
                continue;
            } if((arr[left] == 'a' || arr[left] == 'A' || arr[left] == 'e' || arr[left] == 'E' || arr[left] == 'i' || arr[left] == 'I' || arr[left] == 'o' || arr[left] == 'O'|| arr[left] == 'u' || arr[left] == 'U') &&
                    (arr[right] == 'a' || arr[right] == 'A' || arr[right] == 'e' || arr[right] == 'E' || arr[right] == 'i' || arr[right] == 'I' || arr[right] == 'o' || arr[right] == 'O' || arr[right] == 'u' || arr[right] == 'U')) {
                char character = arr[left];
                arr[left] = arr[right];
                arr[right] = character;
                ++left;
                --right;
                System.out.println("Evaluate");
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }
}
