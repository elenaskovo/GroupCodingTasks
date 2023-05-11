package review7;

public class MethodsTest {
    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        jm.hello();
        jm.helloName("Leo");
        double temp=jm.convertTemp(36.6);
        System.out.println(temp);
        String[] arr=jm.words("Today is May 4");
        for(String str:arr){
            System.out.println(str);
        }


    }
}
/*for (String word : arr) {
            System.out.println(word);
        }*/