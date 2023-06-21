package topinterview150.practice;

public class LongestContinuousSubSquence_674 {
    public static void main(String[] args) {
        LongestContinuousSubSquence_674 obj = new LongestContinuousSubSquence_674();
        System.out.println( obj.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));

    }

    public int findLengthOfLCIS(int[] nums) {
        int count = 1, max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
