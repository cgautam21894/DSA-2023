package topinterview150.Array;

class ReverseWordsInString {
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;

        // Step 1: Reverse the entire character array
        reverse(chars, 0, chars.length - 1);

        // Step 2: Reverse each individual word
        for (int end = 0; end < chars.length; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word (or the only word if there's no space)
        reverse(chars, start, chars.length - 1);

        // Step 3: Convert the character array back to string
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "  Sky is    the Limit   ";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }
}

