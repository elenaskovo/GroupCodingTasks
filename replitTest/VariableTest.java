package replitTest;
/*Declare a static variable **number** that will hold an integer value:

Access **number** from the main method and assign value to it.

Create an Object of the class, access **number** in a nonstatic way and assing value of 200.

Print out **number** using class name and using instance

**Expected Output:**

```
200
```

```
200*/
public class VariableTest {

    static int number=200;
    void print(){
        System.out.println(number);
    }

      public static void main(String[] args) {
          VariableTest test = new VariableTest();
          test.print();
          System.out.println(number);
      }}