package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name= scanner.next();
        if (name.equals("Elena")){
            System.out.println("Mac user");

        }else if(name.equals("Safyan")){
            System.out.println("Good");
        } else if (name.equals("Max")){
            System.out.println("Best");
        }
    }
                }