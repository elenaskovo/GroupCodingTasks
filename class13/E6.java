package class13;

public class E6 {
    public static void main(String[] args) {
        String str="Aaghrs567%#";
        String str1=str.replaceAll("[a-z-A-Z]","");
        System.out.println(str1);
        System.out.println(str.length());

    }
}
