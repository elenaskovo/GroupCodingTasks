package class8;

public class E6NestedLoop {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){//out loop i 3times i
            for (int j=0; j<5; j++){//inner loop j 5times
                System.out.print(j+" ");
            }
            System.out.println(); //to stop
        }


    }
}
