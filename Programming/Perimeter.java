package Programming;

import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {

        System.out.println("Welcome to the perameter calculator!");
        System.out.println("Please enter all four sides in cms:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perameter = a + b + c + d;
        System.out.println("Perimeter of your rectangle is = " + perameter);
    }

}
