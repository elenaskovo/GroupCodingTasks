package homework;

public class Switch {
    public static void main(String[] args) {
        String color="Red";
        switch (color.toLowerCase()){// all cases converts to low case
            case "red":
                System.out.println("Stop");
                break;
            case"orange":
                System.out.println("Yield");
                break;
            case"green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown");
                //no boolean long double and float
                //no logical and relational operation



        }
    }
}
