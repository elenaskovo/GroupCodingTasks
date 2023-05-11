package class13;

public class E12ArraysUtil {
    public static void main(String[] args) {
        //search if the number is present
        int[] arr={10,20,45,89};
        int[]arr1={12,32,455,88};
        int number=100;
        int number1=32;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                System.out.println("Yes");
                for (int j = 0; j< arr1.length; j++) {
                    if (arr1[j]==number1){
                    System.out.println("Yes");
                }

                }


            }
        }}}

