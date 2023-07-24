import java.util.Scanner;

public class ScoreOfIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a score: ");
        for(int count = 1; count<=3; count++) {
            int scores = input.nextInt();
            if(scores % 2 == 0){
                number +=scores;



            }

        }
        System.out.println("Total: "+ number);
    }
}
