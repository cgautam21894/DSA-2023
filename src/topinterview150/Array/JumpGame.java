package topinterview150.Array;

public class JumpGame {

    public static void main(String[] args) {
        JumpGame obj = new JumpGame();
        obj.canJump(new int[]{3, 0, 1, 2, 0, 0, 1});
    }

    public boolean canJump(int[] nums) {
        int furthestIndex = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > furthestIndex) {
                // If current index is beyond the furthest index we can reach
                return false;
            }

            furthestIndex = Math.max(furthestIndex, i + nums[i]);
        }

        return true;
    }


}
