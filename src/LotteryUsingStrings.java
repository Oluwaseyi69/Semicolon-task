import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = " " + (int)(Math.random() * 10)+ (int)(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lotto number: ");
        String guess = scanner.next();

        char lotteryDigits1 = lottery.charAt(1);
        char lotteryDigits2 = lottery.charAt(0);

        char guessDigits1 = guess.charAt(1);
        char guessDigits2 = guess.charAt(0);


        System.out.print("Lottery number is: " + lottery );
        if (guess.equals(lottery)) {
            System.out.print("Exact match, You won $10,000");
        }
        else if (guessDigits1 == lotteryDigits2 && guessDigits2 == lotteryDigits1) {
            System.out.print("Match one digits, You win $3,000");
        }
        else if (guessDigits1 == lotteryDigits1 || guessDigits2 == lotteryDigits2 || guessDigits1 == lotteryDigits2 || guessDigits2 == lotteryDigits1) {
            System.out.print(" Match one digits, You win $1000");
        }
        else
            System.out.print(" Sorry no match ");
    }
}
