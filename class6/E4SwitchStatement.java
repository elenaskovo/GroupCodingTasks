package class6;

public class E4SwitchStatement {
    public static void main(String[] args) {
        int day=7;
        switch(day){
            case 1:
                System.out.println("Mon");
                break; /* to stop*/
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
                case 5:
                    System.out.println("Fri");
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("wrong day");

        }

    }
}
