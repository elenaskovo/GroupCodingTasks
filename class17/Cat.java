package class17;

public class Cat {
    String name;
 Cat(String catName) {
     name = catName;
 }


 Cat(int age){
     System.out.println();
 }
 Cat(double weight){
     System.out.println();

 }
 Cat(){
     System.out.println();
 }

     void printInfo(){
         System.out.println(name);
         System.out.println();
     }

    public static void main(String[] args) {
        Cat cat=new Cat(20.6);
        cat.printInfo();

    }

}
