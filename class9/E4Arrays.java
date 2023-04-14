package class9;

public class E4Arrays {
    public static void main(String[] args) {
        String[] names = {"Kay", "Lulu", "Tesla", "Elvis", "Hercules"};//names


        for (int i = 0; i < names.length; i++) { //always int, names,
            System.out.print(names[i] + " ");//[] names

        }
        System.out.println();// to divide
        int counter = 0;//counter=i
        while (counter < names.length) {
            System.out.print(names[counter] + " ");
            counter++;// to stop the loop
        }
        System.out.println();
        int[] numbers = {2, 4, 10, 15, 22, 71};
        for (int j = 0; j < numbers.length; j++) {
            if (j % 2 == 0) {
                System.out.print(numbers[j] + " ");
            }
            System.out.print(numbers[j]+" ");System.out.println();

            char[]chars={'A','B','C','D','C'};
            for (int i=0;i<chars.length;i+=2){
                System.out.println(chars[i]);
            }

        }

    }
}