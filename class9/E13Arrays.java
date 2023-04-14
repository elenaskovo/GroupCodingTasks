package class9;

import java.util.Scanner;

public class E13Arrays {//enhanced loop -cleaner, easier to understand
    public static void main(String[] args) {
        int[] numbers = new int[3];//5 times variable
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Enter int numbers");
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {

            System.out.println(number);

        }//limitations - no index , cant print reverse ,can not update values
    }
}
