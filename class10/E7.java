package class10;

public class E7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50},// how many elements 5 max index 4
                {20, 50, 65, 20},// 4 elements 3 index
                {102, 54, 60},
                {20, 55}
        };//import
        for (int row = 0;row < matrix.length; row++) {//first row 10


            for (int coloms= 0; coloms< matrix[row].length; coloms++) {//int[]arr=matrix[i];
                System.out.print(matrix[row][coloms]+" ");

            }
            System.out.println();//extra to keep pattern

        }

    }
}
