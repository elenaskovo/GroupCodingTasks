package class17;

public class Dog {
    private String name;
    private String color;
    private String breed;
    int age;
    Dog(String dogName,String dogColor,String dogBreed,int dogAge){

        name=dogName;
        color=dogColor;
        breed=dogBreed;

        age=dogAge;
    }
    void printInfo(){// for printing
        System.out.println(name+" "+color+" "+age+""+breed);
    }}


