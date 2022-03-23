package UI;

import java.util.Scanner;

public class Input {
    static double inputDoubleHigherThanZero() {
        double a = 0;

        while (a <= 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextDouble();
                if (a <= 0) {
                    System.out.println("Number cannot be <=0");
                }
            } catch (Exception e) {
                System.out.println("Input a number!");
            }
        }
        return a;
    }

    static int inputIntHigherThanZeroInRangeToC(int c) {
        int b = 0;
        while (b <= 0 || b > c) {
            try {
                Scanner scanner = new Scanner(System.in);
                b = scanner.nextInt();
                if (b <= 0) {
                    System.out.println("Number cannot be <=0");
                }
                if (b > c) {
                    System.out.println("Number cannot be >" + c);
                }
            } catch (Exception e) {
                System.out.println("Input a number!");
            }
        }
        return b;
    }


}

