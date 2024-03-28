package Programming;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area calculator\n");
        System.out.println("Please enter your base in cms:");
        double base = input.nextDouble();
        System.out.println("Enter your perpendicular height in cms:");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of your triangle is: " + area);
    }

}
