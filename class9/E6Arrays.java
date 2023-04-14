package class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 60, 45, 100};//[] after data //{}
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {//about steps index
                System.out.println(numbers[i]);
            }
        }
        System.out.println();
        boolean[] flags = {true, false, true, false, false, true};
        int counter=0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {// if(!flag[i]){
                counter++;

            }

        }
        System.out.println(counter);
    }
}
