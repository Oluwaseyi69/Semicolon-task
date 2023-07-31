package MBTI;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number of students: ");
        int numberOfStudents = scan.nextInt();
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scan.nextInt();


        int[][] scores = new int[numberOfStudents][numberOfSubjects];


        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("Enter scores for Student " + (index + 1));
            for (int counter = 0; counter < numberOfSubjects; counter++) {
                System.out.print("Enter score for a Subjects " + (counter + 1) + ":");
                scores[index][counter] = scan.nextInt();
            }
//            int [][] total = scores[index][counter];


        }
        System.out.println("Students");

        for (int index = 0; index < numberOfStudents; index++) {
//            System.out.println("Sub " + (index + 1) + ":");
            int total = 0;
            double average = 1;
            int counter;
            for (counter = 0; counter < numberOfSubjects; counter++) {
                total += scores[index][counter];

                System.out.print("Student " + (counter + 1) + " = " + scores[index][counter]);
                for(int subject = 0; subject < numberOfStudents; subject++){
                    System.out.print("Total: " + total +"\t" + "average: " + average);
                    System.out.println();

                }
                System.out.println();
            }
            average = ((double) total / counter);

//            System.out.println("=========================================");

            System.out.println();



        }

    }
}
