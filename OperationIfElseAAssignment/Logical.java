package OperationIfElseAAssignment;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        // Prompt user for the number of ticket sold and price per ticket
        System.out.println("Enter the your age:");
        int age = input.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if (age < 15) {
            System.out.println("you got 75% discount!");

        } else if (isFemale) {
            System.out.println("you got 50% discount!");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount!");
        } else {
            System.out.println("you got no discount!");
        }
    }

}
