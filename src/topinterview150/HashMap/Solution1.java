package topinterview150.HashMap;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        obj.twoSum(new int[]{2, 7, 11, 15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum) && map.get(sum) != i) {
                return new int[]{i, map.get(sum)};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new RuntimeException("exception e");
    }
}
