package topinterview150.Array;

import java.lang.reflect.*;
import java.util.*;

public class Solution135 {
    public static void main(String[] args) {
        Solution135 obj = new Solution135();
        obj.candy(new int[]{1, 2, 87, 87, 87, 2, 1});

    }

    public int candy(int[] ratings) {
        int ans = 0, n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }

        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            ans += Math.max(left[i], right[i]);
        }
        return ans;
    }
}
