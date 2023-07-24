import java.util.Scanner;

public class EvenNumbersIndex {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
//        int score = scan.nextInt();
            int number = 0;
            System.out.print("Enter Scores: ");
            for(int count = 1; count<=10; count++) {
                int scores = scan.nextInt();
                if(scores % 2 == 0){
                    number +=scores;
                }


            }
            System.out.printf("Total: %d%n",number);

        }
    }

