package LeetCode;

public class FirstBadVersion_3 {

    public static boolean isBadVersion(int n) {
        if(n >= 10) {
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int occurs = Integer.MAX_VALUE;

        while(left <= right) {
            int mid = ((right - left) / 2) + left;
            if(isBadVersion(mid)) {
                if(mid < occurs) {
                    occurs = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return occurs;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(20));
    }
}
