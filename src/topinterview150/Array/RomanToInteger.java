package topinterview150.Array;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("DCXXI"));
    }


    public int romanToInt(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0, k = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int num1 = map.get(s.charAt(i));
            int num2 = map.get(s.charAt(i + 1));
            if (num1 < num2) {
                ans += num2 - num1;
                i++;
            } else {
                ans += num1;
            }
            k = i;
        }
        if (k == s.length() - 2) {
            ans += map.get(s.charAt(k + 1));
        }
        return ans;
    }
}
