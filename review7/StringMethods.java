package review7;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";//string is unmutable
        String str1="Hello";
        String str2=new String("Hello");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        str=str.toUpperCase();
        StringBuilder sb=new StringBuilder("Hello");//string builder is mutable!!
        sb.reverse();
        System.out.println(sb);//
        sb.append("Hello");//string builder object
        str= sb.toString();//
        System.out.println(str);
        //write a code to reverse a String
        String given="Class";
        StringBuilder strb=new StringBuilder(given);//given is
        given=strb.reverse().toString();
        System.out.println(given);
        //reverse String without using any inbuilt functions

    }
}
