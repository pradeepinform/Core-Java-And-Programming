package DataTypesVariablesAndInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Welcome  to the user input program!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = scanner.nextLine();
        System.out.println("Enter you age!");
        int age = scanner.nextInt();
        System.out.println("Please you age is " + age);
        System.out.println("Your name is " + name);

    }

}
