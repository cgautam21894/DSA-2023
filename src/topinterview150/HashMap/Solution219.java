package topinterview150.HashMap;

import java.util.*;

public class Solution219 {
    public static void main(String[] args) {
        Solution219 obj = new Solution219();
        obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (Math.abs(index - i) > k) {
                    return false;
                }
                map.put(nums[i], i);
                map.remove(index);
            } else {
                map.put(nums[i], i);
            }
        }
        return true;
    }
}
