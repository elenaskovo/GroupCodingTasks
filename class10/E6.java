package class10;

public class E6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };
        for (int j = 0; j < 3; j++) {//j=3 line could be change arr1.length
            System.out.println();// after loop to keep row

            int[] arr1 = matrix[j];//row
            for (int i = 0; i < arr1.length; i++) {//ar r1.length =3
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
