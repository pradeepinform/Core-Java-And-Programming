package Programming;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        System.out.println("Welcome to odd sum");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is : " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;

        int i = 0;
        while (i <= num) {

            sum += i;
            i += 2;

        }
        return sum;
    }

}
