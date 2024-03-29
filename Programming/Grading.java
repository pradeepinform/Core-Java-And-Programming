package Programming;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator\n");
        System.out.println("Please enter your percentage:");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("Great, You have got A");

        } else if (percentage >= 75) {
            System.out.println("Good Job, You have got B");
        } else if (percentage >= 60) {
            System.out.println("you have got C, Work harder next time");

        } else if (percentage >= 35) {
            System.out.println("You have got D, You seriously need to work hader....next time best of luck");

        } else {
            System.out.println("Sorry, you have faild the thest and got a F...");
        }
    }

}
