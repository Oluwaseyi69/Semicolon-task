package tdd.Snacks_16_07.tdd;

public class Array {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{12, 34, 23, 75, 11, 12};
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0; i < scores.length;i++) {
            if(scores[i] > largestElement){
                largestElement = scores[i];
            }

        }
        System.out.println("Largest: "+ largestElement);
    }
}
