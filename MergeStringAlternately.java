package Kata;

public class MergeStringAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));

    }

    public static String mergeAlternately(String word1, String word2) {
        int len = word1.length() < word2.length() ? word1.length() : word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        result.append(word1.length() > word2.length() ? word1.substring(len) : word2.substring(len));

        return result.toString();
    }
}
