package Programming;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        System.out.println("Welcome to the Compound Interest\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the principle amount.");
        float principle = input.nextFloat();
        System.out.println("Now, tell me for your rate of interest!");
        float rate = input.nextFloat();
        System.out.println("Now, Tell me for how to many are you borrwing this years.");
        float years = input.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your Compound Interest is Rs. = " + compoundInterest);
    }

}
