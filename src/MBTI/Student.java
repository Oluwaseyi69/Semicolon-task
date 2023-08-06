package MBTI;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int studentNumber;
    private int subjectNUmber;
    String [][] scored;
    private int [] totalScore;
   private Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Student student = new Student();
        student.collectInput();
        System.out.println("=".repeat(student.studentNumber *10));
        student.headerPrinter();
        System.out.println("\n"+"=".repeat(student.studentNumber *10));
        student.bodyPrinter();
        System.out.println("=".repeat(student.studentNumber *10));


    }

    public void collectInput() throws InterruptedException {
        System.out.println("Number of Students? ");
        int studentNumber = input.nextInt();

        System.out.println("How many subjects do they offer? ");
        int subjectNumber = input.nextInt();

        if(studentNumber > 0 && subjectNumber > 0){
            this.studentNumber = studentNumber + 1;
            this.subjectNUmber = subjectNumber + 4;
        }
        saving();
        scoreCollector();

    }
    public void scoreCollector() throws InterruptedException {
        String [][] scores = new String[studentNumber][subjectNUmber];
        int []totalScore = new int [studentNumber-1];

        int total = 0;
        for (int counter = 1; counter <= scores.length -1 ;counter ++) {
            for (int index = 1; index < scores[counter].length -3; index++) {

                System.out.println("Enter score for Student" + counter);
                System.out.println("Enter score for subject" + index);

                int userInput = input.nextInt();
                if(userInput >=0 && userInput <=100){
                    scores[counter][index] = String.valueOf(userInput);
                    saving();
                    total+=userInput;
                    double average = (double) total /index;

                    totalScore[counter] = total;

                    scores[counter][studentNumber - 3] = String.valueOf(total);
                    scores[counter][studentNumber - 2] = String.format("%.2f",average);
                    System.out.printf("%.2f", average);
                }
                else{
                    System.out.println("Invalid Input");
                    scoreCollector();
                }
            }
            total = 0;

        }
        scored = scores;
        filler();
    }
    public void saving() throws InterruptedException {
        System.out.print("Saving");
        for (int counter = 0; counter < 10; counter++) {
            System.out.print(">");
            Thread.sleep(150);
        }
        System.out.println("\nSaved Successfully");
    }
    public void headerPrinter(){
        for (int index = 0; index < scored[0].length; index++) {
            System.out.printf("%10s",scored[0][index]);
        }

    }
    public void bodyPrinter(){
        for (int index = 0; index < scored.length; index++) {
            for (int column = 0; column < scored[index].length; column++) {
                System.out.printf("%10s",scored[index][column]);
            }
            System.out.println();

        }
    }
    public void filler(){
        scored[0][0] = "STUDENT";
        for (int index = 0; index < subjectNUmber; index++) {
            scored[0][index] = "SUB" + index;
        }
        for (int index = 0; index < studentNumber; index++) {
            scored[index][0] = "Student" + index;
        }
        scored[0][subjectNUmber - 3] = "TOT";
        scored[0][subjectNUmber - 2] = "AVG";
        scored[0][subjectNUmber - 1] = "POS";

        position();
    }
    public void position(){
        System.out.println(Arrays.toString(totalScore));
        Arrays.sort(totalScore);

        System.out.println(Arrays.toString(totalScore));

        for (int counter = 1; counter < totalScore.length; counter++) {
            for (int index = 1; index < scored.length; index++) {
                if(totalScore[counter] == Integer.parseInt(scored[index][scored[0].length - 3])){
                    scored[counter][subjectNUmber -1] = String.valueOf(studentNumber - counter);
                }
            }
        }
    }
}
