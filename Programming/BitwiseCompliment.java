package Programming;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing to Not/Comliment operator");
        System.out.println("Please enter your number");
        int first = input.nextInt();

        int result = ~first;
        System.out.println("Result is " + result);
    }

}
