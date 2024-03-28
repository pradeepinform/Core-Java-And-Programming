package classAndObject;

public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInliters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block....");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block.....");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInliters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInliters = 5;

    }

    public Car start() {
        int pop = 5;
        if (currentFuelInliters == 0) {
            System.out.println(pop);
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInliters < 5) {
            System.out.println("Car is in reserved mode, please refuel");

        } else {
            System.out.println("Car is started..bbbb");
        }
        return this;
    }

    public void drive() {
        currentFuelInliters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInliters) {
        this.currentFuelInliters += currentFuelInliters;

    }

    public float geCurrentFuelLevel() {
        return currentFuelInliters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInliters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}
