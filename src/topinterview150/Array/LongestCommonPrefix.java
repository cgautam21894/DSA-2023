package topinterview150.Array;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        obj.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    public String longestCommonPrefix(String[] strs) {
        int strlen = strs.length;

        for (int i = 0; i < strlen; i++) {

        }
        return null;
    }

    String isCommon(String str1, String str2) {
        int i = str1.length() - 1, j = str2.length() - 1, count = 0;
        while (i > 0 && j > 0) {
            if (str1.charAt(i) == str2.charAt(j)) {
                count++;
            }
        }
        return null;
    }
}

