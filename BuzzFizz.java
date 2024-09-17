package Kata;

public class BuzzFizz {
    public static void main(String[] args) {
        printFizzBuzz(101);
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(" FizzBuzz ");
            } else if ((i % 3 == 0)) {
                System.out.print(" Fizz ");
            } else if ((i % 5 == 0)) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }
}


// если число на 3 делится, напиши физз. если на 5, то базз. если и на то, и на то, то физбаз