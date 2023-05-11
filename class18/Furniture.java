package class18;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{
    String color="White";
    void printColor(){
        String color="Blue";//(sure.color) - black
        System.out.println(color);//if this.color - white
    }
}
class FurnitureTester{


    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();

    }}
