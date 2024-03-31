package Programming;

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] ars) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operator\n");
        System.out.println("Please Enter the first number:");
        int first = input.nextInt();
        System.out.println("Now, Enter the second number:");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is " + result);
    }

}
