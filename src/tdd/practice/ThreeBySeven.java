package tdd.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeBySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] number = new int[3][7];
        for (int column = 0; column < number.length; column++) {
            for (int row = 0; row < 7; row++) {
                if (row == 0) {
                    System.out.println("Enter a figure: ");
                   int figure = input.nextInt();
                    number[column][row] = figure;
                }
                if (row == 1) {
                    System.out.println("Enter a figure: ");
                    int figure = input.nextInt();
                    number[column][row] = figure;
                }
                if (row == 2) {
                    System.out.println("Enter a figure: ");
                   int figure = input.nextInt();
                    number[column][row] = figure;
                }
                if (row == 3) {

                    int sum = number[column][0] + number[column][1] + number[column][2];
                    number[column][3] = sum;

                }
                if (row == 4) {
                    int average = 0;
                    average = number[column][3]/3;
                    number[column][4] = average;
                }
                if (row == 5) {
                    int lowest2 = number[column][1];
                    int lowest3 = number[column][2];
                    int lowest = number[column][0];
                    if( lowest2 < lowest){
                        lowest = lowest2;
                    }
                    if(lowest3 < lowest){
                        lowest = lowest3;
                    }
                    number[column][5] = lowest;
                }
                if (row == 6) {
                    int highest3 = number[column][2];
                    int highest2 = number[column][1];
                    int highest = number[column][0];
                    if (highest2 > highest){
                        highest = highest2;
                    }
                    if(highest3 > highest ){
                        highest = highest3;
                    }
                    number[column][6] = highest;
                }
            }
        }
        System.out.println(Arrays.deepToString(number));
    }
}
