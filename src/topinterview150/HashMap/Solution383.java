package topinterview150.HashMap;

import java.util.*;

public class Solution383 {
    public static void main(String[] args) {
        Solution383 obj = new Solution383();
        obj.canConstruct("aa", "abcdeettttyyyy");
    }

    //Solution 1: Using HashMap
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0) {
                int count = map.get(ransomNote.charAt(i));
                map.put(ransomNote.charAt(i), count - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    /*
Time Complexity: O(m)
Space Complexity: O(1);
 */
    public boolean canConstruct1(String ransomNote, String magazine) {
        int ch[] = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            int m = magazine.charAt(i) - 'a';
            ch[m]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int m = ransomNote.charAt(i) - 'a';
            ch[m]--;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Time Complexity: O(m+n)
Space Complexity: O(1);
 */
