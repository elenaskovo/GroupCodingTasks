package review5;

public class Task6 {
    public static void main(String[] args) {
        /* to check a giving number is prim or not
        >1; divisible by itself only
        example;3(2),5(2,3,4),7(2,3,4,5,6,
         */
        int num=11;

        boolean isPrime=true;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }

    }
}
