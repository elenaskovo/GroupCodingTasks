package class15;

import java.util.Arrays;

public class E1 {
    // create a method that takes call it size number as input and creates an array of
// ints with size give by that number fill the array with some numbers lets
//say 10 call the method createArray
    //returns the array
    //createArray(5) -{1,1,1,1,1}
   int[]createArray(int size){
       int[]arr=new int[size];
       for (int i = 0; i < size; i++) {
           arr[i] = 10;
       }return arr;

       }

    public static void main(String[] args) {
        E1 e1=new E1();
        int[] array = e1.createArray(5);
        System.out.println(Arrays.toString(array));
    }
   }
//for(int i=0;i,array.length;i++){