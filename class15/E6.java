package class15;

public class E6 {
    /*Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/
    String empId;
    double salary;
    static String nameCEO="Sumair";

    public static void main(String[] args) {
        E6 asghar=new E6();
        asghar.empId="123456";
        asghar.salary=900000;
        System.out.println(asghar.nameCEO);//nothe good way
        System.out.println(E6.nameCEO);
        System.out.println();
        E6 elena=new E6();
        elena.empId="198456";
        elena.salary=987600;
        System.out.println(elena);//nothe good way
        System.out.println(elena);
        System.out.println(elena);
    }


}
//int empID;
//    int salary;
//    static String CEO="Sumair";
//
//    public static void main(String[] args) {
//        SyntaxEmployee employeeOne= new SyntaxEmployee();
//        employeeOne.empID=45632;
//        employeeOne.salary=100000;
//        employeeOne.CEO="Sumair";
//
//
//
//        SyntaxEmployee employeeTwo= new SyntaxEmployee();
//        employeeTwo.empID=32453;
//        employeeTwo.salary=125000;
//        employeeTwo.CEO="Sumair";
//String empID;
//    int salary;
//    static String CEO = "Sumair";
//
//    public static void main(String[] args) {
//
//        SyntaxEmployee e1 = new SyntaxEmployee();
//        SyntaxEmployee e2 = new SyntaxEmployee();
//        e1.empID = "465465";
//        e1.salary = 110000;
//        e2.empID = "723485";
//        e2.salary = 111000;
//        System.out.println(e1.empID + ", $" + e1.salary + ", CEO: " + CEO);
//        System.out.println(e2.empID + ", $" + e2.salary + ", CEO: " + CEO);