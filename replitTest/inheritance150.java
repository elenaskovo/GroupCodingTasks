package replitTest;


import class16.Person;
           class PersonMain {
            String name;
            String lastName;
            int age;

        }



        class Employee extends PersonMain {
            int salary = 35000;
            String name = "Joe";
            String lastName = "Smith";
            int age = 35;

        }
        class Student extends Employee {
            int grade=10;
            String name="Adam";
            String lastName="Smith";
            int age=15;



        }
        class Retiree extends PersonMain {

            String seniorActivity = "tour";
            String name="Frank";
            String lastName="Smith";
            int something=15;

        }
            class inheritance150  {

                public static void main(String args[]) {


                    Employee obj = new Employee();
                    Student obj1 = new Student();
                    Retiree obj2 = new Retiree();
                    System.out.println(obj.name+" "+obj.lastName+" "+obj.age+" "+obj.salary);
                    System.out.println(obj1.name+" "+obj1.lastName+" "+obj1.age+" "+obj1.grade);
                    System.out.println(obj2.name+" "+obj2.lastName+" "+obj2.something +" "+obj2.seniorActivity);
                }
            }

