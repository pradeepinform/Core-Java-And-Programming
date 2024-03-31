package Programming;

import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        System.err.println("Welcome to Reverse the digits:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Number:");
        int num = input.nextInt();

        int reverseNum = reverse(num);
        System.out.println("Your Number is Reverse\n:" + reverseNum);

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
