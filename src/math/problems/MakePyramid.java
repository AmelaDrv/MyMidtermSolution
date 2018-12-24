package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int x = 30;
        for(int i=0; i<x; i++) {
            for(int j=0; j<x-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
              System.out.print("* ");
            }
            System.out.println();
        }
    }
}




