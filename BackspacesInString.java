package Kata;

import java.util.ArrayDeque;
import java.util.Deque;

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
public class BackspacesInString {

    public static void main(String[] args) {
        System.out.println(cleanString("fdjk#mn#kn#KJ#J#"));

    }
    public static String cleanString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i<s.length(); i++){
            char с = s.charAt(i);
            if (с != '#') {stack.push(с);}
            else if (!stack.isEmpty()) {stack.pop();}
        }

        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {sb.append(stack.removeLast());}
            return sb.toString();
    }
}

//public class SolutionTest {
//    @Test
//    public void testCleanString() {
//        final BackspacesInString bis = new BackspacesInString();
//        assertEquals("ac", bis.cleanString("abc#d##c"));
//        assertEquals("", bis.cleanString("abc####d##c#"));
//    }
//}
