package class14;

public class E1Methods {
    void printWord(String word){
        System.out.println(word);
    }
    /*void= return type of the method void means this method does not return any data - written type
     printWord - name of the method
     (String word) - parameters/input
     System.out.println(word);- body of the method you can write if,else,loop*/
    public static void main(String[] args) {
        // creating an object of the E1Methods class
        //in java all the classes - data types
        //new E1Methods() - new and after ...class - creating the object of E1Methods class and storing in obj
        E1Methods obj = new E1Methods();
        //printWorld( -method on obj variable object and passing "java" as argument or input
        obj.printWord("Java");
    }

}//

