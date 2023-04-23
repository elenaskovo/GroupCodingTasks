package GroupCodingTasks;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program
        //which will calculate the sum of even and odd numbers
        //for that array.
        int[][] array={{10,15,25,50},
                {5,35,60},
                {22,55,44},
                {77,44,22}};
        int sumOdd=0;
        int sumEven=0;
        int number;
        for(int r=0;r< array.length;r++) {
            for (int c = 0; c < array[r].length; c++) {
                number = array[r][c];//number int
                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }
        }
        System.out.println("Sum of Even "+sumEven);
        System.out.println("Sum of Odd "+sumOdd);
    }

    }

