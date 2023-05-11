package review7;

public class JavaMethods {//* reuseable block of code to perform specific task
    /*we have to develop methods: open/close browser,open exel, extracting data from excel*/
   /* methods:return value,do not return
   /* with parameters or without

    */
    void hello(){
        System.out.println("Hello");// not return
    }
void helloName(String name){//not return but with parameters
    System.out.println("Hello "+name);
}
// method that accept 3 string,concatenates them and return a new Concatenated String
    String concatenate(String str1,String str2,String str3){
       return str1.concat(str2).concat(str3);

    }
    //create a method that will return me the largest number from given 2
    /*nt largestNumber(int a, int b){
        int large=0;
        if(a>b){
            large=large+a;
        }else{
            large=large+b;
        }
        return large;

    }*/
    int largest(int num1,int num2) {
        int large;
        if (num1 > num2) {
            large = num1;
        } else {
            large = num2;
        }
        return large;
    }
    //int convertToF(int c) {
    //        return c * (9/5) + 32;
    //    }


        double convertTemp(double cel){
        double f=cel*9/5+32;
        return f;
        }
      // method return anArray of words from given Sentence

        String[] createArr(String sentence) {
            return sentence.split(" ");
        }
        String[]words(String sentence){
        String[]words=sentence.split(" ");
        return words;
    }
    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        jm.hello();
        jm.helloName("Leo");
        String St="May";

    }

}




