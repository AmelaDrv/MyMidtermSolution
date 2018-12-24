package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int x = 0;
        int y = 1;
        for (int i = 0; i < 40; i++) {
            x = x + y;
            y = x - y;
            System.out.println(x);
        }

    }

    }
