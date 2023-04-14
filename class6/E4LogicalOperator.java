package class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E4LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Your height inches");
        int height=scanner.nextInt();
        if (height<60){
            System.out.println("Short");
        } else if (height>=60 && height<=72) {
            System.out.println("M");
        }else {
            System.out.println("Tall");
        }
        }


    }

