import java.util.Scanner;

public class ExerciseAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        double average = 0;
        System.out.print("Enter Scores: ");
        for(int num = 1; num<=5; num++) {
            int scores = scan.nextInt();
            number = number + scores;
            average = (double) number / num;
        }
        System.out.printf("Total: %d%nAverage:  %.2f ", number,average);

    }
}
