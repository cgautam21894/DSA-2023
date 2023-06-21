package topinterview150.Math;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.isPalindrome(-121);
    }

    public boolean isPalindrome(int x) {

        List<Integer> list = new ArrayList<>();
        int n = x;
        if (x < 0) {
            x = Math.abs(x);
        }
        while (x > 0) {
            int rem = x % 10;
            list.add(rem);
            x = x / 10;
        }
        if (n < 0) {
            list.set(0, list.get(0) * -1);
        }
        int j = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
