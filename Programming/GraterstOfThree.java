package Programming;

import java.util.Scanner;

public class GraterstOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to the World of three\n");
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Enter the second number:");
        int second = input.nextInt();
        System.out.println("Enter the three number:");
        int three = input.nextInt();

        if (first >= second && first > three) {
            System.out.println(first + " First is the Largest number");

        } else if (second >= three) {
            System.out.println(second + " Second is the Largest number ");
        } else {
            System.out.println(three + " Third is Largest number");
        }
    }

}
