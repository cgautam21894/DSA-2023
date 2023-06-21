package topinterview150.Math;

public class Solution_69 {
    public static void main(String[] args) {
        Solution_69 obj = new Solution_69();
        obj.mySqrt(14);
    }

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = mid * mid;
            if (num < x) {
                left = mid + 1;
            } else if (num > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
