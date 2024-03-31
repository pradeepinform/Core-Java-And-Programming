package Programming;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or operator.");
        System.out.println("Please enter first number");
        int first = input.nextInt();
        System.out.println("Now, Enter the second number");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is " + result);
    }

}
