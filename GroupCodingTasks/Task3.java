package GroupCodingTasks;

public class Task3 {
    public static void main(String[] args) {

        //create a 2D array or integer type where you will store
        //odd and even numbers. Develop a program which will
        //identify/print the even numbers only.
        int[][] array = {{25,66,71,32},
                         {72,12,29,45},
                         {56, 2},
                         {67, 11,48,53}};


        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c]%2==0){
                    System.out.print(array[r][c]+" ");

                }


                }

                System.out.println();

            }
        }
    }

