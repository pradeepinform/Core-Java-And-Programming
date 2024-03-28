package Programming;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker\n");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("your number is positive");

        } else if (num == 0) {
            System.out.println("your number is Zero");

        } else {
            System.out.println("Your number is Negative");
        }
    }

}
