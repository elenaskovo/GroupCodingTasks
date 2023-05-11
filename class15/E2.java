package class15;

public class E2 {
    //creat a method call it method1 print hello in the method1 in the body
    //it schoud print hello world
    void method(){
        System.out.println("Hello World");
    }
    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr

     int sumArr(int[]arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
     }

    public static void main(String[] args) {
        E2 e2=new E2();
        int[]arr={10,10,10};

    }
     }