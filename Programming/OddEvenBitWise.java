package Programming;

import java.util.Scanner;

public class OddEvenBitWise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Even/Odd Number:");
        System.out.println("Enter the Number:");
        int num = input.nextInt();
        if ((num & 1) == 1) {

            System.out.println("Your number is odd");

        } else {
            System.out.println("Your number is even");
        }

    }

}
