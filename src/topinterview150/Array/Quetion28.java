package topinterview150.Array;

public class Quetion28 {
    public static void main(String[] args) {
        Quetion28 obj = new Quetion28();
        System.out.println(obj.strStr("aadbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        } else {
            int count = 0, j = 0;
            for (int i = 0; i < haystack.length(); i++) {
                if (j < needle.length() && needle.charAt(j) == haystack.charAt(i)) {
                    count++;
                    j++;
                }
                if (count == needle.length()) {
                    return i - (needle.length() - 1);
                }
            }
        }

        return -1;
    }
}
