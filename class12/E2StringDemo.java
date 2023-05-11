package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "pass123";
        if (userName.length() > 8 && password.length() > 8) {

            System.out.println("cant be more then 8 character");
        } else  {
            System.out.println("Signup seccessful");
        }
    }}


