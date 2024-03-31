package Programming;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial.");
        System.out.println("Please enter your number:");
        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial is : " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 0;

        }
        long fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;

        }
        return fact;
    }
}
