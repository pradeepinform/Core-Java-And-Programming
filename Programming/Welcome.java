package Programming;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to Softech Learn");
    }

}
