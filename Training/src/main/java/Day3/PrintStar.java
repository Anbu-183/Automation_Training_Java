package Day3;

import java.util.Scanner;

public class PrintStar {

    public static void main(String[] args) {
        int rows = 4, k = 0;

        for (int i = 1; i <= rows; ++i, k=0) {
//            System.out.println("FFF");
            for (int space = 1; space <= rows - i; ++space) {
//                System.out.println("TTT");
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
//                System.out.println("Anbu");
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

    }
}


