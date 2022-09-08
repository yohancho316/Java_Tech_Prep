package LeetCode;

public class FirstBadVersion_2 {

    public static boolean isBadVersion(int version) {
        if(version >= 2) return true;
        return false;
    }

    public static int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        int bad = Integer.MAX_VALUE;

        while(left <= right) {
            int mid = ((right - left) / 2) + left;
            if(isBadVersion(mid) == true) {
                if(mid < bad) {
                    bad = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return bad;
    }

    public static void main(String[] args) {
        System.out.println("Bad Version Starts At: " + firstBadVersion(10));
    }
}
