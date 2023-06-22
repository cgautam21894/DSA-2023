package topinterview150.TwoPointers;

import java.util.*;

public class Q5_3Sum {
    public static void main(String[] args) {
        Q5_3Sum obj = new Q5_3Sum();
        obj.threeSum1(new int[]{-1,0,1,2,-1,-4});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            if (i == 0 || nums[i - 1] != nums[i]) {
                while (left < right) {
                    int sum = nums[left] + nums[right] + first;
                    if (sum == 0) {
                        ans.add(Arrays.asList(first, nums[left], nums[right]));
                        left++;
                        right--;
                        //Here if we put nums[left]==nums[left+1], it will skip the some element in case of
                        //-2, 0, 1, 1, 2. (1,1) will be skip in given array.

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return ans;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    //current i value hence && seen.get(complement) == i this condition
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
}
