package topinterview150.HashMap;

import java.util.*;

public class Solution49 {
    public static void main(String[] args) {
        Solution49 obj = new Solution49();
        List<List<String>> ans = obj.groupAnagrams2(new String[]{"bdddddddddd", "bbbbbbbbbbc"});
        System.out.println(ans);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String s2 = sortString(strs[i]);
            if (map.containsKey(s2)) {
                List<String> liString = map.get(s2);
                liString.add(strs[i]);
            } else {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                map.put(s2, li);
            }
        }
        for (List<String> str : map.values()) {
            ans.add(str);
        }

        return ans;
    }

    /*
    Using Sorting
    TC: O(NKLOGK)
    SP: O(NK)
     */
    String sortString(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return String.valueOf(s);
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
    /*
Without Sorting
TC: O(NK)
SP: O(NK)
 */

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int ch[] = new int[26];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            Arrays.fill(ch, 0);
            for (int j = 0; j < strs[i].length(); j++) {
                ch[strs[i].charAt(j) - 'a']++;
            }

            //Here # is use to seperate out count of each char like 0 10 10 and 0 1 0 10"
            StringBuffer br = new StringBuffer();
            for (int j = 0; j < ch.length; j++) {
                br.append("#");
                br.append(ch[j]);
            }
            String s2 = br.toString();

            if (map.containsKey(s2)) {
                List<String> liString = map.get(s2);
                liString.add(strs[i]);
            } else {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                map.put(s2, li);
            }
        }
        for (List<String> str : map.values()) {
            ans.add(str);
        }

        return ans;
    }
}
