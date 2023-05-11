package class13;

public class E2 {
    public static void main(String[] args) {
        String str="njdyHKBNCFCXT2334gcj";
        System.out.println(str.replaceAll("a-z","*"));
        System.out.println(str.replaceAll("A-Z","#"));
        System.out.println(str.replaceAll("0-9","%"));
        System.out.println(str.replaceAll("a-z0-9","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","%"));

    }
}
