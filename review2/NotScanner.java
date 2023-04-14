package review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        int i=10;

        Scanner key=new Scanner(System.in);// memorise
        System.out.println("Print enter full sentence");

        String sentence=key.nextLine();
        System.out.println("I will get a job");
        System.out.println("Please enter 1 word");
        String word=key.next();
        System.out.println("Word that was captured = "+word);
        System.out.println("Please inter integer value");
        int number=key.nextInt();
        System.out.println("Entered number is = "+number);
        System.out.println("Enter decimal value");
        double decimal=key.nextDouble();
        System.out.println();

    }
}
