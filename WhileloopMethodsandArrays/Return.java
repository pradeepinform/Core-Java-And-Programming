package WhileloopMethodsandArrays;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        great();
        int first = readNumber();
        // System.out.println(first);
        int second = readNumber();
        // System.out.println(second);

        int sum = first + second;
        System.out.println("Sum of the number is " + sum);

    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int number = input.nextInt();
        return number;
    }

    public static void great() {
        System.out.println("Welcom to Calculator\n");
    }

}
