package class9;

public class E11Arrays {
    public static void main(String[] args) {
        int[]numbers=new int[5]; //new int[5] - create an array of int with size 5 fixed
        numbers[2]=70; //store 50 on index 0
        numbers[3]=80;
        numbers[0]=50;
        numbers[1]=60;
        numbers[4]=90;

        for (int number:numbers){
            System.out.println(number);
        }

    }
}
