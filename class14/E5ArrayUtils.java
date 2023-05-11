package class14;

public class E5ArrayUtils {
    //create a method called contains it takes an array of int and int number in the method
        //should reasch the array fot THAT number int num =20,if that number is present in the array method should return true
        //otherwise false

            //array of int and an int numbers -parameters ==int[] arr,int num
           //return type ==boolean
        boolean contains(int[] arr, int num){
            boolean isFound=false;
        for (int i= 0; i < arr.length ;i ++) {
            if(arr[i]==num){
                isFound=true;//the same with boolean
        }

    }
        return isFound;
}

    public static void main(String[] args) {


        int[]arr={10,20,45};//array variable
        int number=20;
        E5ArrayUtils obj=new E5ArrayUtils();
        boolean result=obj.contains(arr,number);

        System.out.println(result);
    }}