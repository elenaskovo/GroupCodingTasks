package review2;

public class AnotherNestedif {
    public static void main(String[] args) {
        /*if vaccinated or not
        if 1 dose - need the second



         */
        boolean vaccine=true;
        int dose=1;
        if (vaccine){
            if (dose==1) {
                System.out.println("get second");
            }else if(dose==2) {
                System.out.println("fully");
            }else if (dose==3){
                System.out.println("fully with booster");


            }
        }
    }
}
