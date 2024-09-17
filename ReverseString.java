package Kata;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Да, давай сделаем это непонятно какой раз";
        StringBuilder str2 = new StringBuilder(str);
        System.out.println(str2.reverse().toString());
    }
}
