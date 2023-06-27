package topinterview150.Array;

public class Solution42 {
    public static void main(String[] args) {
        Solution42 obj = new Solution42();
        obj.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.min(left[i], right[i]) - height[i];
            if (diff > 0) ans += diff;
        }

        return ans;
    }
    /*
    TC: O(n)
    SC: O(n)
     */

    public int trap1(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                }
                ans += left_max - height[left];
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                }
                ans += right_max - height[right];
                right--;
            }
        }
        return ans;
    }
}

/*
TC: O(n)
SC: O(1)
 */
