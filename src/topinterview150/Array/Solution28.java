package topinterview150.Array;

public class Solution28 {
    public static void main(String[] args) {
        Solution28 obj = new Solution28();
        System.out.println(obj.strStr("a", "a"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            for (int j = 0; j < n; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return j;
                }
            }

        }
        return -1;
    }
}

/*
 TC: O(M*N)
 SC: O(1)
 */