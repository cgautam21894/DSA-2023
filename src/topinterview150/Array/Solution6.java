package topinterview150.Array;

public class Solution6 {


    public static void main(String[] args) {
        Solution6 obj = new Solution6();
        obj.convert("PAYPALISHIRING", 4);
    }


    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int charNumSection = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int cur_index = i;
            while (cur_index < s.length()) {
                ans.append(s.charAt(cur_index));
                if (i != 0 && i != numRows - 1) {
                    int noOfChars = charNumSection - i * 2;
                    int cur_index1 = noOfChars + cur_index;
                    if (cur_index1 < s.length()) {
                        ans.append(s.charAt(cur_index1));
                    }
                }
                cur_index += charNumSection;
            }
        }
        System.out.println(ans);
        return ans.toString();
    }

    /*
    TC: O(n)
    SC: O(1)
     */

}
