package GroupCodingTasks;

public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from
        //an Array of Strings
        String[]group= new String[]{"Matilda", "Tesla", "Lulu", "Phantom"};
        for (int i=0;i< group.length;i++){
        for (int j=i+1;j< group.length;j++){
        if (group[i].equals(group[j])){
            System.out.println("Duplicate element: "+group[j]);

        }
    }
}}}

