package Class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hungry enter true/false");
        boolean hungry= scanner.nextBoolean();
        if(hungry){
            System.out.println("Pizza");
        }else{
            System.out.println("Work");
        }
    }
}
