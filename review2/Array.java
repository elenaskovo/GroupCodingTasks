package review2;

public class Array {
    public static void main(String[] args) {
        int i=10;
        int[] arr=new int[3];
        //store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        //access also by indexes
        System.out.println(arr[2]);//
        System.out.println();//

        String []planets={"Earth", "Mars", "Jupiter","Saturn","Neptune"};//planets - list of strings
        //System.out.println(" Enhanced for loop  ");// used just with arrays and collection
        for(String planet:planets){
            System.out.print(planet+" ");//planet is name of each verible
        //for (int j = 0; j < planets.length ; j++) {// use index
            //System.out.print(planets[j]+" ");

        }







    }
}
