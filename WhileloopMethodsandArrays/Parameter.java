package WhileloopMethodsandArrays;

public class Parameter {

    public static void main(String[] args) {

        System.out.println(sumTwoNumber(78, 55));
        System.out.println(sumTwoNumber(88, 550));
    }

    public static int sumTwoNumber(int firstNum, int secondNum) {
        System.out.println("First Number " + firstNum);
        System.out.println("Second Number " + secondNum);
        return firstNum + secondNum;
    }

}
