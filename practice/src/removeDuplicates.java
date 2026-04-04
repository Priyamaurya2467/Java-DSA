import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int n = lengthOfLastWords(s);
        System.out.println(n);
    }
    static int lengthOfLastWords(String s) {
        String[] words = s.split(" ");
        String word = words[words.length - 1];
        return word.length();
    }
}
