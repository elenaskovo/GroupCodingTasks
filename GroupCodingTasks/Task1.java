package GroupCodingTasks;

public class Task1 {
    public static void main(String[] args) {
        int[]temp={50,60,55,65,62,58,52};
        int highest=temp[0];
        int lowest=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]>highest){
                highest=temp[i];
            }else if(temp[i]<lowest){
                lowest=temp[i];
            }
        }
        System.out.println("the highest temperature of the week is "+highest);
        System.out.println("the lowest temperature of the week is "+lowest);

    }

    //Create a program that uses an array to store a list of temperatures for a week,
    //and then uses a loop to find the highest and lowest temperature for the week.

}
