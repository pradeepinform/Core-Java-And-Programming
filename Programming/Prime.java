package Programming;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Prime Number checkers.");
        System.out.println("Please enter a number:");
        int num = input.nextInt();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your number is Prime.");

        } else {
            System.out.println("Your number is not prime.");
        }

    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;

            }
            i++;

        }
        return true;
    }
}
