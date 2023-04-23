package class12;

public class Car {
    String color;
    String model;
    String make;
    int mileage;
    boolean inAutomatic; //'in 'is convention for boolean
    int doors;
    int year;

    void drive() {
        System.out.println("Fast");

    }
    void startCar(){
        System.out.println("Applying the brakes to stop the car");
    }
    void heat() {
        System.out.println("it's hot....");
    }
        void move(){

            System.out.println("Starting the engin");
        }
        void turning(){
            System.out.println("Using the key");

        }

    void signal() {
        System.out.println("beep beep");
    }
}

