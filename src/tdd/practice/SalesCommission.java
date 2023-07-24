package tdd.practice;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter value of sales: ");
            double gross = scan.nextDouble();
            double commission =value(gross);

            System.out.printf("Commission: %.2f%n", commission);

        }
    }
public static double value;
public double gross;


public static double value(double gross){
    double commission = 200 + 0.09 * gross;
            return commission;
    }
}
