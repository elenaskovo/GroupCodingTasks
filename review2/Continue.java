package review2;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;//move on, skip (i==3)
            }
            System.out.println(i);
            System.out.println("Hi");
            System.out.println("Buy");


        }
    }
}
