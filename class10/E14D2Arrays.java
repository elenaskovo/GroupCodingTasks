package class10;

public class E14D2Arrays {

        public static void main(String[] args){

            int[][] array = {
                    {-5,-2,-3,7},
                    {1,-5,-2, 2},
                    {1,-2, 3,-4}
            };
            int sum=0;
            int number;
            for (int[] ints : array) {
                for (int c = 0; c < ints.length; c++) {

                    number = ints[c];

                    sum = number + ints[c];

                }
            }
            System.out.println(sum);
}}
