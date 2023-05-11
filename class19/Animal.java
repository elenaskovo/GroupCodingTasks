package class19;

public class Animal {
    int age;

    String name;
    String color;
    String breed;
    double weight;

    public Animal(String name, String breed, String color, int age, double weight) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + breed + " " + color + " " + weight);
    }


    //// create 3 classes like Dog Cat Horse define 5 properties in each class
    //    // and one printInfo method that will print the values of these variables.
    //    // create constructors as well in each child class to initialize those
    //    // properties create one object of each class and call the printInfo method
    class Dog extends Animal {
        double price;

        public Dog(String name, String breed, String color, int age, double weight) {
            super(name, color, breed, age, weight);
            this.price = price;
        }

        void printInfo(){
        super.printInfo();
            System.out.println(price);



    }
}

/*class Dog extends Animal{
 Dog(String name, String breed, String color, int age, double weight){
     this.breed=breed;
     this.name=name;
     this.color=color;
     this.age=age;
     this.weight=weight;
 }*/


    class Cat extends Animal {
        public Cat(String name, String breed, String color, int age, double weight){
            super(name,color,breed,age,weight);

    }
    class Horse extends Animal{
        public Horse(String name, String breed, String color, int age, double weight){
            super(name,color,breed,age,weight);

        }}}}








