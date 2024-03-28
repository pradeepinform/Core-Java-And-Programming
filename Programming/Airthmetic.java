package Programming;

import java.util.Scanner;

public class Airthmetic {

    public static void main(String[] args) {

        System.out.println("Welcome to Airthmetic Operators");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number:");
        int num1 = input.nextInt();
        System.out.println("Enter the next number:");
        int num2 = input.nextInt();
        // addition
        int add = num1 + num2;
        System.out.println("Addition = " + add);

        int sub = num1 - num2;
        System.out.println("Substraction =  " + sub);

        int multi = num1 * num2;
        System.out.println("Multiplication = " + multi);

        int muduls = num1 % num2;
        System.out.println("Moduls = " + muduls);
    }

}
