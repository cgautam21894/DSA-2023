package topinterview150.Array;

public class Solution134 {
    public static void main(String[] args) {
        Solution134 obj = new Solution134();
        System.out.println(obj.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentSum = 0;
        int totalSum = 0;
        int pos = 0;
        for (int i = 0; i < gas.length; i++) {
            currentSum += gas[i] - cost[i];
            if (currentSum < 0) {
                pos = i + 1;
                currentSum = 0;// since we want when the sum is positive that point
            }
            totalSum += gas[i] - cost[i];
        }
        return totalSum >= 0 ? pos : -1;
    }
}
