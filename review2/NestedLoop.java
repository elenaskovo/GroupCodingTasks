package review2;

public class NestedLoop {// loop inside another loop control iterations of inner loop
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {//out loop//if outer loop false condition - all will skip
            System.out.println(i);
            for (int j = 0; j <=1 ; j++) {//inner loop depends on outer loop//if inner is false - just skip inner
                System.out.println(j);

            }

        }// from outer 1 then inner 01 then outer 2 then inner 0 1 back to outer 3 then to inner 0 1

    }
}
