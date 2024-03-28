package Programming;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        System.out.println("Welcome to Two Number Swap...");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num1 = input.nextInt();
        System.out.println("Next Enter the Number..");
        int num2 = input.nextInt();

        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swaping Done...........");
        System.out.println("First Number is " + num1);
        System.out.println("Second Number is " + num2);
    }

}
