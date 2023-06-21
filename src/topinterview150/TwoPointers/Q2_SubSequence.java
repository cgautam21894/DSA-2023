package topinterview150.TwoPointers;

public class Q2_SubSequence {
    public static void main(String[] args) {
        Q2_SubSequence obj = new Q2_SubSequence();
        obj.isSubsequence("axc", "ahbgdc");
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int j = 0, count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                count++;
                j++;
            }
            if (count == s.length()) {
                return true;
            }
        }
        return false;
    }
}
