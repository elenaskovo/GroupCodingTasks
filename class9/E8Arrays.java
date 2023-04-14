package class9;

public class E8Arrays {
    public static void main(String[] args) {
        int[] numbers = {0,1, 2, 3, 4, 5,6};
        for (int i=7;i<numbers.length;i--){//from the last index
            System.out.println(i);
        }
        System.out.println();
        char[] chars = {'A','B', 'C', 'D', 'E', 'F','G'};//char is always ''
        for (int i=5;i<numbers.length-1;i--){// or int i=chars.length-1;i>=0;i--
            System.out.println(i+" "+chars[i]);
        }

    }
}
