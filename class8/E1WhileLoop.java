package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //ask start and end amd step or without step - int step=scanner.next

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the start and the end");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int counter=start;// after asking where to start Java stored number in counter
        while(counter<=end){

            System.out.print(counter+" ");//number+=step;
            counter=counter+step;//counter++;

        }
    }
}
