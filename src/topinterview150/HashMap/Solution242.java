package topinterview150.HashMap;

import java.util.*;

public class Solution242 {
    public static void main(String[] args) {
        Solution242 obj = new Solution242();
        System.out.println(obj.isAnagram1("anagram", "nagarqam"));
    }

    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (String.valueOf(ch1).equals(String.valueOf(ch2))) {
            return true;
        }
        return false;
    }

    public boolean isAnagram1(String s, String t) {
        int ch[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            ch[t.charAt(i)]--;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
