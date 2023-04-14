package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //create a boolean var "summer" store true in it then
        //write a loop as long as summer temp var store 85
        //till 100 enjoy exceeds 100 -too hot, use break

        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("enjoy");
            } else {
                System.out.println("too hot");
                break;//stop
            }


            temp = temp + 3;
        }


    }
}

