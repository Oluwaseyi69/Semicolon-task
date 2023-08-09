package Assignment;

import java.util.Scanner;

public class StudentGrade {

    private int numberOfStudent;
    private int numberOfSubject;
    private int studentScore;
    private int scores;
    private Scanner input = new Scanner(System.in);
    private String[][] collector;
    private double [] averageCollector;


    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.studentScore();
    }

    public void studentScore() {
        System.out.print("Enter number of Student: ");
        String userOne = input.next();
        numberOfStudent = Integer.parseInt(userOne) + 1;

        System.out.print("Enter number of Subjects: ");
        String userTwo = input.next();
        numberOfSubject = Integer.parseInt(userTwo) + 4;

        header();
    }

    public void header() {
        String[][] newArray = new String[numberOfStudent][numberOfSubject];

        newArray[0][0] = "STUDENT";

        for (int counter = 0; counter < newArray[0].length; counter++) {
            newArray[0][counter] = "SUB" + counter;
        }

        for (int i = 1; i < numberOfStudent; i++) {
            newArray[0][i] = "SUB" + i;

        }
        newArray[0][newArray[0].length - 1] = "POS";
        newArray[0][newArray[0].length - 2] = "AVG";
        newArray[0][newArray[0].length - 3] = "TOT";
        collector = newArray;
        scores();
    }

    public void headerPrinter() {
        System.out.println("=".repeat(numberOfSubject * 10));
        for (int index = 0; index < collector[0].length; index++) {

            System.out.printf("%10s", collector[0][index]);

        }
        System.out.println();
        System.out.println("=".repeat(numberOfSubject * 10));

        printer();
    }

    public void scores() {
        int counter = 0;
        int total = 0;
        int index;
        for (index = 1; index < numberOfStudent; index++) {

            for (counter = 1; counter < numberOfSubject - 3; counter++) {
                System.out.println("Enter the score Student " + (index));
                System.out.println("Enter the score for Subject " + (counter));
                String userScore = input.next();

                if (Integer.parseInt(userScore) >= 0 && Integer.parseInt(userScore) <= 100 &&
                        userScore.matches("\\d+(\\. \\d+)?")){

                    collector[index][counter] = userScore;

                    int number = Integer.parseInt(userScore);

                    total += number;
                    collector[index][collector[0].length - 3] = String.valueOf(total);
                }else {
                    System.out.println("Invalid Input");
                    scores();
                }
            }
            total = 0;
        }
        headerPrinter();
    }

    public void printer(){
        for (int counter = 1; counter < collector.length; counter++) {
            for (int count = 1; count < collector[0].length; count++) {
                System.out.print(collector[counter][count] + "  ");
            }

        }
    }
    public void averageCalculator(){
        for (int index = 0; index < 7; index++) {
            
        }
    }

}
