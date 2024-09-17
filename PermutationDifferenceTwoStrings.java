package Kata;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class PermutationDifferenceTwoStrings {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sc.length; i++) {
          map.put(st[i], i);
        }
        for (int j = 0; j < st.length; j++) {
            if (map.containsKey(sc[j])) sum = sum + abs(map.get(sc[j]) - j);
        }


        return sum;
    }
}
