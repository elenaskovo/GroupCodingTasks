package class8;

public class E3ForleLoop {
    //add all even start loop from 1-30 only even numbers
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=30;i++){
            if (i%2==0){
                sum=sum+i;// adding all the even numbers
            }


        }
        System.out.println(sum);// print outside the loop ,so we can ger just last sum


    }

}
