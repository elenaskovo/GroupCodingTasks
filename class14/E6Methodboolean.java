package class14;

public class E6Methodboolean {
    boolean isEven(int number) {
        boolean isNumEven = false;

        if (number % 2 == 0) {
            isNumEven = true;//the same with boolean
        }
        return isNumEven; //return number%2==0;
    }

    public static void main(String[] args) {
        E6Methodboolean obj=new E6Methodboolean();
        System.out.println(obj.isEven(15));
    }}
