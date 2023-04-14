package Class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your gender");
        /*no direct method for the char datatype in scanner class we use a work around we first use the next method
        next() when we have a take String
         */

        char gender=scanner.next().charAt(0);


        System.out.println("you entered "+gender);

    }
}
