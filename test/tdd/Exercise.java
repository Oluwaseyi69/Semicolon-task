package tdd;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second number: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int average = sum / 2;
        System.out.printf("Sum Equals: %d%nAverage: %d", sum, average);

    }
}
