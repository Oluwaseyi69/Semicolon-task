import java.util.Scanner;

public class AverageOfSCoreIndex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        double average = 0;
        System.out.print("Enter a score: ");
        for(int count = 1; count<=3; count++) {
            int scores = keyboard.nextInt();
            if(scores % 2 == 0){
                number +=scores;
                average = (double) number /count;

            }

        }
        System.out.printf("Total Number: %d%nAverage: %.2f",number,average);

    }
}
