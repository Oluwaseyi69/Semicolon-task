package tdd.Snacks_16_07.tdd;

public class TotalLists {
    public static void main(String[] args) {
        int [] array = {2, 2, 2,};
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total+=array[counter];
        }
        System.out.println("Total: "+ total);
    }
}
