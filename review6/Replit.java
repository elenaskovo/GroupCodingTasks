package review6;

public class Replit {
    public static void main(String[] args) {


    String input="Elena can do it";
    String [] elena =input.split("[ ]");
        for (int j = 0; j < elena.length; j++) {
        for (int i = elena[j].length()-1; i >=0 ; i--) {
            System.out.print(elena[j].charAt(i)+ "");
        }
        System.out.print(" ");
    }
}}
