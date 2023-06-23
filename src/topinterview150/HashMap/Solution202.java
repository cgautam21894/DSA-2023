package topinterview150.HashMap;

public class Solution202 {
    public static void main(String[] args) {
        Solution202 obj = new Solution202();
        obj.isHappy(19);

    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNum(n);

        while (fast != 1 && slow != fast) {
            slow = getNum(slow);
            fast = getNum(getNum(fast));
        }


        return fast == 1 || slow == 1;
    }

    int getNum(int n) {
        int sum = 0;
        while (n > 0) {
            int n1 = n % 10;
            n = n / 10;
            sum = sum + (n1 * n1);

        }
        return sum;
    }


}
