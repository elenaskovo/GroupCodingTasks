package review2;

import java.util.Scanner;


    class Main {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter name of the instructor");
            String name= scanner.next();
            switch(name){
                case"Asghar":
                    System.out.println("Will take care of Java Assignment");
                    break;
                case"Moazzam":
                    System.out.println("Will take care of SDLC Assignment");
                    break;
                case "Weqas":
                    System.out.println("Will take care of Selenium Assignment");
                case "Asel":
                    System.out.println("Will take care of every Assignment");
                default:
                    System.out.println("Invalid instructor selected");


            }
        }
    }
