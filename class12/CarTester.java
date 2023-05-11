package class12;

public class CarTester {
    public static void main(String[] args) {
        //below code -object of the car class
        Car car=new Car();
        car.make="Tayota";
        car.model="Camry";
        car.color="White";
        car.mileage=0;

        car.startCar();
        car.turning();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="s";
        car1.startCar();
        car1.signal();




    }
}
