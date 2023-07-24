package tdd;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class CreditCardValidator {

    public static String cardValidation;
    public static String cardType;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter card details to verify: ");
        String cardNumber = scan.next();
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {
            String cardType;
            if (cardNumber.startsWith("4")) {
                cardType = "VisaCard";
            }
            if (cardNumber.startsWith("5")) {
                cardType = "Master Card";
            }
            if (cardNumber.startsWith("3") && cardNumber.startsWith("7")) {
                cardType = "American Express Cards";
            }
            if (cardNumber.startsWith("6")) {
                cardType = "Discover Cards";
            }
        }

        int length = cardNumber.length();

        int card = 0;
        for (int index = 0; index < cardNumber.length(); index++) {
            card = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));

        }


        String result = validation(card);
        System.out.print("*".repeat(50) +
                "\n** Credit card Type: " + cardType +
                "\n** Credit Card Number:  " + cardNumber +
                "\n** Credit Card Digit Length: " + length +
                "\n** Credit Card Validity Status: " + result + "\n" +
                "*".repeat(50));
    }

    public static String validation(int... card) {
        int totalOfSums = 0;
        for (int counter = card.length - 1; counter > 0; counter--) {
            int evenSum = 0;
            int oddSum = 0;
            totalOfSums = 0;

            if (counter % 2 == 0) {
                card[counter] *= 2;
                if (card[counter] >= 10) {
                    evenSum += (card[counter] % 10) + (card[counter] / 10 % 10);
                } else evenSum += card[counter];
            }
            if (counter % 2 != 0) {
                oddSum += card[counter];
            }
            totalOfSums = evenSum + oddSum;
        }
        if (totalOfSums % 10 == 0) {
            cardValidation = "Valid";
        } else {
            cardValidation = "Invalid";
        }
        return cardValidation;
    }

}




