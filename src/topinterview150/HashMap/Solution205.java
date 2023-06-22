package topinterview150.HashMap;

import java.util.*;

public class Solution205 {
    public static void main(String[] args) {
        Solution205 obj = new Solution205();
        obj.isIsomorphic1("badc", "baba");
    }


    //Optimized Approach
    public boolean isIsomorphic1(String s, String t) {
        int[] sArray = new int[256];
        Arrays.fill(sArray, -1);
        int[] tArray = new int[256];
        Arrays.fill(tArray, -1);

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (sArray[s1] == -1 && tArray[t1] == -1) {
                sArray[s1] = t1;
                sArray[t1] = s1;
            }

            if (!(sArray[s1] == t1 && tArray[t1] == s1)) {
                return false;
            }
        }
        return true;
    }

    /*
    TC: O(n)
    SC: O(1)
     */

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                if (map.values().contains(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
