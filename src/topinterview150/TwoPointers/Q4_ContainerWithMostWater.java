package topinterview150.TwoPointers;

public class Q4_ContainerWithMostWater {
    public static void main(String[] args) {
        Q4_ContainerWithMostWater obj = new Q4_ContainerWithMostWater();
        obj.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public int maxArea(int[] height) {
        int left = 0, maxArea = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            maxArea = Math.max(maxArea, width * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
/*
TC: O(n) one pass
SC: O(1)
 */
