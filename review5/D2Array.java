package review5;

public class D2Array {
    public static void main(String[] args) {
        String[][] cars={
                {"Ford","Lincoln","Dodge"},
                {"BMW","Audi","Mercedes","VW","Fiat"},
                {"Honda","Toyota","Subaru","Nissan"}
        };
        System.out.println(cars[1][1]);
        for (String[]garage:cars){//iterates over each 1d array
            for(String car:garage){//iterates over each element
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
