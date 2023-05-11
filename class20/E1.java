package class20;

public class E1 {
    String name;//properties, attributes,instance variables
    String color;
    int age;



    E1(String name,String color,int age ) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
        void bark() {
            System.out.println("Bark");
        }

        void sleep() {
            System.out.println("zzzzZZZ");
        }

        void run() {
            System.out.println(" run ");
        }
    }


         class Dog extends E1 {
             Dog(String color, String name, int age) {
                 super(color, name, age);
             }
             @Override
                 void sleep(){
                     System.out.println("I like to sleep for 10,6 hours a day");
             }
         }
     class Cat1 extends E1{

         Cat1(String color, String name, int age) {
            super(color, name, age);
}

}
class Horse1 extends E1{

         Horse1(String color, String breed, int age) {

             super(color, breed, age);
}

}



             /*  public static void main(String[] args) {
        Dog dog=new Dog("jackie", "brown", 4);
        Cat cat=new Cat("tuxedo", "black", 4);
        Horse horse=new Horse("bukefal", "brown", 4);

        dog.eating();
        dog.running();

        cat.sleep();
        cat.eating();

        horse.running();
        horse.sleep();
    }
}



class Dog extends Animal {

    Dog(String name, String color, int numberOfLegs) {
        this.name=name;
        this.color=color;
        this.numberOfLegs=numberOfLegs;
    }
}
}*/