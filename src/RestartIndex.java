import java.util.Scanner;

public class RestartIndex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        for(int count = 1; count<=3; count++ ) {
            System.out.print("Enter a score: ");
            int scores = keyboard.nextInt();
            if(scores == 30 ){
                number = 0;
            }

        }
        System.out.println("Total Valid number: "+ number);
    }
    }

