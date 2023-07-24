package tdd.Snacks_16_07;

public class EvenPositions {
    public static void main(String[] args) {
        final int array_length = 10;
        int [] array = new int[array_length];
        for(int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%d%n", array[counter]);
        }
    }
}
