package class16;

public class Person {
    String name;
    Person(){//no arguments
        System.out.println("No Argument Construction");

    }
    Person(String personName){
        name=personName;
        System.out.println("1 Argument Construction");

    }

}
