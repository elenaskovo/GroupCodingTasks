package class7;

import java.util.Scanner;

public class E12WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter number greater then 1"); //asking numbers to start the loop

        int lastNumber= scan.nextInt();
        int counter=1;
        while (counter <= lastNumber) {

            System.out.print(counter + " ");
            counter++;
        }
    }
}
