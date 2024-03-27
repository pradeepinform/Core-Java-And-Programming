package DataTypesVariablesAndInput;

public class TypeConversion {

    public static void main(String[] args) {

        // Implicit means small data type to convert large data type conversion.
        // Implicit type conversion
        int num2 = 145;
        System.out.println(num2);

        float myFloat = num2;
        System.out.println(myFloat);

        // Explicit means large data type to convert small data type conversion
        // Explicit Type Conversion
        float num1 = 5.2f;
        System.out.println(num1);

        int myInt = (int) num1;
        System.out.println((myInt));
    }

}
