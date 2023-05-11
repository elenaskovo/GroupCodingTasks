package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="ksnfksnDSKJDSDJ1232344@#$%^&*";
        System.out.println(str.replaceAll("[^a-z]",""));//^ not replace
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-z]","\\$"));
    }
}
