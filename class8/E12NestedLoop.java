package class8;

public class E12NestedLoop {
    public static void main(String[] args) {
        /*
        12345
        23456
        34567
         */
        for (int i = 0; i < 3; i++) {// out loop 3times


            for (int j = 1; j < 6; j++) {//first line , inside loop 5 times
                System.out.print(j+i+" ");//

            }
            System.out.println();



        }
    }
}
