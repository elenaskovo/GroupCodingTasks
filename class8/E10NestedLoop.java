package class8;

public class E10NestedLoop {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            if(j%2!=0){
                System.out.println("odd index");
                continue;
            }

            for (int i = 0; i < 5; i++) {
                System.out.print("# ");
            }
            System.out.println();//empty to close

        }
    }

    }//3 times

