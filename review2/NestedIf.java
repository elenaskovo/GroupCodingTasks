package review2;

import java.sql.SQLOutput;

public class NestedIf {
    public static void main(String[] args) {
        boolean DL=false;
        boolean car=false;

                if (DL){
                    System.out.println("Do you have a car");
                    if(car) {
                        System.out.println("drive to work");
                    }else {
                        System.out.println("take uber");
                    }
                } else {
                    System.out.println("get DL");
                }



    }
}
