package topinterview150.Array;

public class Solution12 {
    public static void main(String[] args) {
        Solution12 obj = new Solution12();
        obj.intToRoman(1994);

    }


    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    //MCMXCIV
    public String intToRoman(int num) {
        StringBuffer br = new StringBuffer();
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num > values[i]) {
                num = num - values[i];
                br.append(symbols[i]);
            }
        }
        return br.toString();
    }
}
