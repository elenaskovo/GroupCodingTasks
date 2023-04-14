package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
//1 2 4 5 7 8 10
        int counter=1;
        while(counter<=20){
            if(counter%3!=0) {
                System.out.println(counter + " ");
            }
            counter ++;
        }
    }
}
