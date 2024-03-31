package Programming;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        System.out.println("Welcome to RightShift operator!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();

        int result = num >> 2;
        System.out.println("Result is " + result);
    }

}
