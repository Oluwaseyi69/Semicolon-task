package tdd.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] number = new int[4];
//        int counter;
        for (int index = 0; index < number.length; index++) {
            System.out.print("Enter four digit: ");
            int digit = scanner.nextInt();
            number[index] = digit;
            number[index] += 7;
            number[index]  %= 10;

        }
        System.out.println(Arrays.toString(number));
    }
}





