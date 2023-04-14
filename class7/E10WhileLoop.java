package class7;

public class E10WhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        while (counter >= 1) {// or >0

            System.out.print(counter + " ");
            counter--;
        }
        counter=20; //whithout int
        System.out.println();// just for a new line
        while(counter<=100){
            System.out.print(counter+" ");// print left to right
            counter+=2;//%2=0 -even numbers , if(counter%2!=0
        }
        counter=100;
        System.out.println();
        while(counter>=1) {// or %2==1 means uneven numbers
            if (counter % 2 == 1) {// ne zabut posle if
                System.out.println(counter + " ");// just print vertical
            }
            counter--;
        }// 3 skobki

    }
}

