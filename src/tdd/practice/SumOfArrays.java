package tdd.practice;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = keyboard.nextInt();
        double [] numbers = new double[l];
//
        double sum = 0;
        double average = 0;
        System.out.print("Enter figures: ");
        for(int k = 0; k < l; k++){
            numbers[k] = keyboard.nextDouble();
            sum+= numbers[k];
             average = sum /numbers[k];
        }

        System.out.println("sum: "+ sum);
        System.out.printf("average: %.2f",average);

    }

}
