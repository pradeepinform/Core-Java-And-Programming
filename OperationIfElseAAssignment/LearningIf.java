package OperationIfElseAAssignment;

public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "John";

        System.out.println("Before if");

        if (isMale) {
            System.out.println("Hello, Mr." + name);

        } else {
            System.out.println("Hello, Mrs." + name);
        }

        boolean isSeniorCitizen = false;
        // boolean isAnAdult = true;
        boolean isAnAdult = true;

        if (isSeniorCitizen) {
            System.out.println("Hellow Senior Citizen");
        } else {
            if (isAnAdult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("Hello Child");
            }
        }
    }

}
