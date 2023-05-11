package review6;

public class Task9 {
    public static void main(String[] args) {//second largest
        int[] numbers = {10,-20,30,40,11,22,33,44};
        int largest = numbers[0];
        int secondLargest = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Number "+ secondLargest+" is the second largest number.");
        System.out.println();
    }

}

