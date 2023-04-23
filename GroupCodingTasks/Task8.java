package GroupCodingTasks;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int[]numbers={2,6,34,75,21,7};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
        if (numbers[i]>max){
            max=numbers[i];
        }
         if(numbers[i]<min){
            min=numbers[i];
        }

        }
        System.out.println("the maximum number is "+max);
        System.out.println("the minimum number is "+min);
    }
}
