package class17;

public class Car {
    String  make;
    String model;
    int engineCC;
    String color;
    Car(String make, String model, int engineCC, String carColor) {
        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+engineCC);

    }

    public static void main(String[] args) {
       // Car car=new Car("Honda","Civic type R");
        //car.printInfo();
    }
}
