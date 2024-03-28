package WhileloopMethodsandArrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] myArr = new int[5];

        myArr[0] = 98;
        myArr[3] = 65;
        myArr[1] = 2;
        myArr[2] = 8;
        myArr[4] = 37;
        // int[] myArr1 = { 98, 2, 8, 65, 37 };

        int index = 2;
        System.out.println(myArr[index]);
        System.out.println(myArr[2]);

        // Array Traversal

        int index1 = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

        String strArr[] = new String[4];
        strArr[0] = "My String";
        String[] newStrArr = { "First", "Second", "Third" };
        System.out.println(newStrArr.length);
        System.out.println(strArr[0]);

    }

}
