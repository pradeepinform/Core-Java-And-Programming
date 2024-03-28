package Programming;

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        System.out.println("we are doing float Multiplication Number.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = input.nextDouble();

        double mul = num1 * num2;
        System.out.println("Result is =" + mul);

    }

}
