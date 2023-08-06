package tdd.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SevenByThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] number = new int[7][3];
        for (int column = 0; column < number.length ; column++) {
            for (int row= 0; row  < 3 ; row++) {
                if (column == 0){
                    System.out.println("Enter a figure: ");
                    int figure = scan.nextInt();
                    number[column][row] = figure;
                }
                if (column == 1){
                    System.out.println("Enter a figure: ");
                    int figure = scan.nextInt();
                    number[column][row] = figure;
                }
                if (column == 2){
                    System.out.println("Enter a figure: ");
                    int figure = scan.nextInt();
                    number[column][row] = figure;
                }
                if (column == 3){
                    int sum = number[0][row] + number[1][row] + number[2][row];
                    number[3][row] = sum;
                }
                if (column == 4){
                    int average = 0;
                     average = number[3][row]/3;
                     number[4][row] = average;
                }
                if (column == 5){
                    int lowest = number[0][row];
                    int lowest2 = number[1][row];
                    int lowest3 = number[2][row];
                    if(lowest2 < lowest){
                        lowest = lowest2;
                    }
                    if (lowest3 < lowest ){
                        lowest = lowest3;
                    }
                    number[5][row]=lowest;
                }
                if (column == 6){
                    int highest = number[0][row];
                    int highest2 = number[1][row];
                    int highest3 = number[2][row];
                    if(highest2 > highest){
                        highest = highest2;
                    }
                    if(highest3 > highest){
                        highest = highest3;
                    }
                    number[6][row] = highest;

                }

            }

        }
        System.out.println(Arrays.deepToString(number));
    }
}
