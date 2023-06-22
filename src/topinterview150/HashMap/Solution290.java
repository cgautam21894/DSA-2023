package topinterview150.HashMap;

import java.util.*;

public class Solution290 {
    public static void main(String[] args) {
        Solution290 obj = new Solution290();
        boolean ans = obj.wordPattern1("abba", "dog cat cat fish");
        System.out.println(ans);
    }

    public boolean wordPattern1(String pattern, String s) {

        HashMap map = new HashMap<>();
        String str[] = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        for (Integer i = 0; i < str.length; i++) {
            String s1 = str[i];
            char ch = pattern.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }

            if (!map.containsKey(s1)) {
                map.put(s1, i);
            }
            //If i is primitive then it will add diffrent integer object in map so using Integer
            if (map.get(ch) != map.get(s1)) {
                return false;
            }
        }

        return true;
    }

    /*
    TC: O(m+n) where N represents the length of s and M represents the length of pattern
    SC: : O(W) where W is the number of unique characters in pattern and words in s
     */
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String str[] = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                String p = map.get(pattern.charAt(i));
                if (!p.equals(str[i])) {
                    return false;
                }
            } else {
                if (map.values().contains(str[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), str[i]);
            }
        }
        return true;
    }
}
