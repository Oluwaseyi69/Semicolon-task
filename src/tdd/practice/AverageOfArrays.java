package tdd.practice;

import java.util.Scanner;

public class AverageOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of numbers: ");
        int s = scanner.nextInt();
        double[]numbers = new double[s];

        double sum = 0;
        System.out.print("Enter the numbers: ");
        for(int t = 0; t<s; t++){
            numbers[t] = scanner.nextDouble();
            sum+=numbers[t];
        }
        double average = sum/s;
        System.out.printf("The average is: %.2f", average);
    }
}
