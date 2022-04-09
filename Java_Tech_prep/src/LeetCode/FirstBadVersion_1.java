package LeetCode;

public class FirstBadVersion_1 {

    public static boolean isBadVersion(int n) {
        if(n >= 6) return true;

        return false;
    }

    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while(left <= right) {

            int mid = left + ((right - left) / 2);

            if(isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(firstBadVersion(n));
    }
}
