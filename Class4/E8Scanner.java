package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your salary");
        //
        int salary= scanner.nextInt();
        if (salary>10000){
            System.out.println("Rich");
        }else {
            System.out.println("Poor");
        }

    }
}
