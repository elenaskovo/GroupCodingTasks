package review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String day="Thursday";
        char character=day.charAt(2);//char
        System.out.println(character);
        int index=day.indexOf('s');
        System.out.println(index);
        String food="I like indian food";
        String []words=food.split(" ");
        for(String word:words){
        System.out.println(word);
    }
}}
