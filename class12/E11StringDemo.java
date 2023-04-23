package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        String name="Today is Saturday";
        //print all the indexes wherever the letter"a"


        for(int i=0; i< name.length();i++){

            if(name.charAt(i)=='a'){//
                System.out.print(i+" ");
                //System.out.println(name.chartAt(i));//prints all 3 "a"
            }
        }

    }
}
    /*int count = 0;
        for (int i = 0; i < name.length(); i++) {
        if (name.charAt(i) == 'a')  {
        count++;
        System.out.println(i);*/