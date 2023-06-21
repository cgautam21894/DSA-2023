package topinterview150.SlidingWindow;

import java.util.*;

public class SummaryRanges {
    public static void main(String[] args) {
        int a[] = {0, 2, 3, 4, 6, 8, 9, 11};
        SummaryRanges obj = new SummaryRanges();
        System.out.println(obj.summaryRanges(a));

    }

    public List<String> summaryRanges(int[] nums) {
        final List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + 1) != nums[i + 1]) {
                ans.add(String.valueOf(nums[i]));
            } else {
                int j = nums[i];
                while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                    i++;
                }
                ans.add(j + "->" + nums[i]);
            }
            if (i == nums.length - 2 && nums[i] + 1 != nums[i + 1]) {
                ans.add(String.valueOf(nums[i + 1]));
            }
        }

        return ans;
    }
}

