package classAndObject;

public class Driver {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(9);
        System.out.println(myCar.geCurrentFuelLevel());
    }

}
