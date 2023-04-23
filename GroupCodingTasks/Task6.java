package GroupCodingTasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Write a java program to check whether a given
        //number is prime or not?
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");

        int number= scanner.nextInt();

        boolean isPrime=true;
        if(number>1){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }

    }


    }

