package Programming;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {

        System.out.println("Welcome to LeftShift Operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Any number:");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Result is " + result);
    }

}
