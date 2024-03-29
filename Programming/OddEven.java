package Programming;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Welcome to Even And Odd Calcutator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is an even number");

        } else {
            System.out.println("Your number is a odd number");
        }
    }

}
