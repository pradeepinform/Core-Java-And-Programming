package Programming;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator.");
        System.out.println("Enter the First Number");
        int firstNum = input.nextInt();
        System.out.println("Now, Enter the Second Number.");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Total Sum Number is " + sum);
    }

}
