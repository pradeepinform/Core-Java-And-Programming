package Programming;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digit");
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        int sumofdigit = sumOfDigits(num);
        System.out.println("Sum of Digit is :" + sumofdigit);

    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;

        }
        return sum;
    }
}
