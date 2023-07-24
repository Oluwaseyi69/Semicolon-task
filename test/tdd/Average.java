package tdd;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int NoOfStudents = 20;
        int gradeCounter = 1;

        while (gradeCounter <=10){
            System.out.print("Enter a grade: ");
            int grade = scanner.nextInt();
            totalScore = totalScore + grade;
            gradeCounter++;
        }
        int average = totalScore / NoOfStudents;

        System.out.printf("**************************************************  %n" );
        System.out.printf("      Aso Rock Secondary School, Abuja Nigeria   %n");
        System.out.printf("************************************************** %n" );
        System.out.printf("Class: SSS3 %n");
        System.out.printf("Number of student: 2  %n");
        System.out.printf("Total score:  %d%n", totalScore);
        System.out.printf("Average score:  %d%n", average);
        System.out.print("**************************************************" );
    }
}
