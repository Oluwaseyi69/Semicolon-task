import java.util.Scanner;

public class ValidNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        for(int count = 1; count<=10; ) {
            System.out.print("Enter a score: ");
            int scores = keyboard.nextInt();
            if(scores >=0 && scores <=100 ){
                number+= scores;
                count++;
            }

        }
        System.out.println("Total Valid number: "+ number);
    }
}
