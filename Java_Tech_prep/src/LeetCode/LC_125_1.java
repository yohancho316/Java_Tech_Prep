package LeetCode;

public class LC_125_1 {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String x = "a";



        System.out.println("State: " + isPalindrome(x));
    }

    public static boolean isPalindrome(String s) {
        if(isOnlyWhiteSpace(s.trim()) || s.length() == 1) return true;
        int left = 0; int right = s.length() - 1;

        while(left < right) {

            if(!(Character.isLetterOrDigit(s.charAt(left)))) {
                System.out.println(s.charAt(left) + " is not a letter or digit");
                ++left;
                continue;
            }

            if(!(Character.isLetterOrDigit(s.charAt(right)))) {
                System.out.println(s.charAt(right) + " is not a letter or digit");
                --right;
                continue;
            }

            if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                System.out.println(s.charAt(left) + " is equal to " + s.charAt(right));
                ++left;
                --right;
            } else return false;
        }

        return true;
    }

    public static boolean isOnlyWhiteSpace(String str) {
        // Trim the string to remove leading and trailing white spaces
        String trimmedStr = str.trim();

        // Check if the trimmed string is empty
        return trimmedStr.isEmpty();
    }
}
