package class9;

public class E12Arrays {
    public static void main(String[] args) {
        int[]numbers=new int[5];//
        int num=50;//start
        for (int i=0;i<numbers.length;i++){
            numbers[i]=num;
            num=num+10;
        }// ] between
          for(int number:numbers){
              System.out.println(number);
          }
    }
}
