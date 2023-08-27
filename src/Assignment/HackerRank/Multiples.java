package Assignment.HackerRank;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for N: ");
        int N = scan.nextInt();
//        int N = 2;
        for (int i = 1; i <=10 ; i++) {
            int result = N * i;
            System.out.printf("%s x %d = %s%n", N, i, result);
        }
        System.out.println();
    }
}
