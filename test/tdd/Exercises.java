package tdd;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int score = scan.nextInt();
        int number = 0;
        System.out.print("Enter Scores: ");
        for(int num = 1; num<=10; num++) {
        int scores = scan.nextInt();
        number += scores;}
        System.out.printf("%d", number);

    }
}
