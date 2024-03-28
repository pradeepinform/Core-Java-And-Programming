package starPattenprogram;

public class PattenDesign {

    public static void main(String[] args) {

        printFirstPattern();
    }

    public static void printFirstPattern() {
        int row = 0;
        while (row <= 10) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;

        }
    }

}
