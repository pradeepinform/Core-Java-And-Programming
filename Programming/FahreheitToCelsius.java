package Programming;

import java.util.Scanner;

public class FahreheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature converter");
        System.out.println("Enter your templature in Fahreheit");
        float fahreheit = input.nextFloat();

        float cel = (fahreheit - 32) * 5.0f / 9.0f;
        System.out.println("Your temperature is = " + cel + " C ");
    }

}
