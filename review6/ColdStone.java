package review6;

public class ColdStone {
    public static void main(String[] args) {
        IceCream iCream=new IceCream();//IceCream data type
        iCream.flavor="Vanilla";
        iCream.color="White";
        iCream.dairyFree=false;
        iCream.price=2.99;
        iCream.eat();
        iCream.buy();
        System.out.println();

        IceCream iCream2=new IceCream();
        iCream2.flavor="Pistachio";
        iCream2.color="Greene";
        iCream2.dairyFree=true;
        iCream2.price=5.99;
        iCream2.eat();
        iCream2.buy();

    }
}
