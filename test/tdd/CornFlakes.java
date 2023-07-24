package tdd;

import java.util.Scanner;

public class CornFlakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfStudent = 1;
        int sum = 0;

        System.out.print("Enter score or -25 to end: ");
        int score = scanner.nextInt();
        while (score != -25){
            sum += score;
            noOfStudent += 1;
            System.out.print("Enter score or -25 to end: ");
            score = scanner.nextInt();
        }
        int average = sum / noOfStudent;
        System.out.printf("**************************************************  %n" );
        System.out.printf("      Aso Rock Secondary School, Abuja Nigeria   %n");
        System.out.printf("************************************************** %n" );
        System.out.printf("Class: SSS3 %n");
        System.out.printf("Number of student:  %n", noOfStudent);
        System.out.printf("Total score:  %d%n", sum);
        System.out.printf("Average score:  %.2f%n", average);
        System.out.print("**************************************************" );


    }
}
