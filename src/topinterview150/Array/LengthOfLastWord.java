package topinterview150.Array;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        obj.lengthOfLastWord("   fly me   to   the moon  ");
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
