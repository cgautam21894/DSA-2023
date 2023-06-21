package topinterview150.Math;

public class PlusOne {

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        obj.plusOne(new int[]{9, 9, 9, 9});
    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
