import java.util.Scanner;

public class AverageOfValid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        double average = 0;

        for(int count = 1; count<=10; count++) {
            System.out.print("Enter a score: ");
            int scores = keyboard.nextInt();
            if(scores >=0 && scores <=100 ){
                number+= scores;
                average++;
            }

        }
        System.out.println("Average: "+ (double) number /average);
    }
}

