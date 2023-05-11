package HomeworkGitHub;

public class Teacher {
    /*Write a Java program called Teacher.
      Identify features and 4 behaviour of that Class.
       Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
    String name;
    String lastName;
    int age;
    int salary;

    void teach() {
        System.out.println("Teach on line");
    }
    class MathTeacher extends Teacher{
        String name="Sasha";
        String lastName="Kuz";
        int age=35;
        int salary=100000;



    }
    class ChemistryTeacher extends Teacher{
        String labWork;
        String name="Boris";
        String lastName="Kaz";
        int age=45;
        int salary=100000;
    }
    class Piano extends Teacher{
        String labWork;
        String name="Anna";
        String lastName="Ritz";
        int age=30;
        int salary=100000;
}}
