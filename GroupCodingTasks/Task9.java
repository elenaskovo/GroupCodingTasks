package GroupCodingTasks;

public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest
        //number in the array?
        int []number={24,55,91,52,11};
        int largest=0;
        int secondLargest=0;

        for (int i = 0; i <number.length ; i++) {
            if (number[i]>largest){
                secondLargest=largest;
                largest=number[i];
            }
            else if (number[i]>secondLargest && number[i]!=largest) {
                secondLargest=number[i];

            }
        }
        System.out.println("second largest number is "+secondLargest);


    }
}
