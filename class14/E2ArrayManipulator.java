package class14;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class E2ArrayManipulator {
    //create a method - take int array call it sumArr and return the sum of all the elements from array
    //create the object ot the clss and call the method
    //return type - int
    //name of the method - sumArr
    //parameters - (int[] arr)
    //
    int sumArr(int[]arr){
        int sum=0;
                for(int i=0;i<arr.length;i++) {
                    sum = sum + arr[i];
                    //for(int num:arr){
                }
                    return sum;

        }

    public static void main(String[] args) {
                    E2ArrayManipulator obj=new E2ArrayManipulator();
                    int[]array={10,20,30};//array variable
                    int result=obj.sumArr(array);
            System.out.println(result);
    }
}
