package Programming;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplecation table.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printMultiplicatonTable(num);
    }

    public static void printMultiplicatonTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));

            i++;

        }
    }

}
