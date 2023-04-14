package class5;
import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your age");
        int Age=scanner.nextInt();

        if (Age < 10) {
            System.out.println("Kiddo");
        }
        if (Age > 16) {

            System.out.println("Adult");

        }
    }
}










