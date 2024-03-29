package Programming;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to Age Calculator \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter your Age:");
        int age = input.nextInt();

        if (age >= 70) {
            System.out.println("Your are Citizen in India");

        } else if (age >= 55) {
            System.out.println("You are adult in India");

        } else if (age >= 34) {
            System.out.println("You are a teenager in India");

        } else {
            System.out.println("You are a child in India");
        }
    }

}
