package topinterview150.HashMap;

import java.util.*;

public class Solution128 {
    public static void main(String[] args) {
        Solution128 obj = new Solution128();
        obj.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6});
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        if(nums.length==1 || nums.length==0){
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count = 1, ans = 1;
        for (int i : set) {
            if (set.contains(i + 1)) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        return ans;
    }

    /*
    TC: O(n)
    SC: O(n)
     */
}
