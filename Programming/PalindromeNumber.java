package Programming;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number!");
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        boolean isPalindromeNumber = isPalindromeNumber(num);

        if (isPalindromeNumber) {
            System.out.println("Your number is a palindrome number.");

        } else {
            System.out.println("Your number is not a palindrome number.");
        }
    }

    public static boolean isPalindromeNumber(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }
}
