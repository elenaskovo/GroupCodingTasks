package GroupCodingTasks;

public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of
        //Fibonacci series.




            int[] fib= new int[10];//10 counts

            fib[0]=0;
            fib[1]=1;
            for(int i =2; i<10; i++){
                fib[i]=fib[i-1]+fib[i-2];
                System.out.print(fib[i]+" ");


            }
        }}



