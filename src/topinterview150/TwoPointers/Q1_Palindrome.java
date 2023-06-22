package topinterview150.TwoPointers;

public class Q1_Palindrome {
    public static void main(String[] args) {
        Q1_Palindrome obj = new Q1_Palindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s ) {
        String str = s.toLowerCase();
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            while (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    boolean palindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
