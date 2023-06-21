package topinterview150.Array;

public class Solution151 {
    public static void main(String[] args) {
        Solution151 obj = new Solution151();
        obj.reverseWords("  the sky is blue  ");
    }

    public String reverseWords(String s) {
        s = trimString(s);
        String[] str = s.split(" ");
        int left = 0;
        int right = str.length - 1;
        StringBuffer br = new StringBuffer();
        while (left <= right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(i) != ' ')
                br.append(str[i] + ' ');
            if (i != str.length - 1)
                br.append(' ');
        }
        return br.toString();
    }

    String trimString(String str) {
        int left = 0;
        while (str.charAt(left) == ' ') {
            left++;
        }
        int right = str.length() - 1;
        while (str.charAt(right) == ' ') {
            right--;
        }
        return str.substring(left, right + 1);
    }
}
