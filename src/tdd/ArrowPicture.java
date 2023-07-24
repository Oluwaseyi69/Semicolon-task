package tdd;

public class ArrowPicture {
    public static void main(String[] args) {
       int[][] picture = {
        { 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 1, 1, 1, 0, 0},
        { 0, 1, 1, 1, 1, 1, 0},
        { 1, 1, 1, 1, 1, 1, 1},
        { 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 0, 1, 0, 0, 0},
    };
        for (int[] ints : picture) {
            System.out.println(" ");
            for (int anInt : ints) {
                if (anInt == 0) System.out.print(" ");
                else if (anInt == 1) System.out.print("*");
            }

        }

    }
}
