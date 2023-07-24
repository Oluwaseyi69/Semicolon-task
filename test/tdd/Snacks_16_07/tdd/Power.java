package tdd.Snacks_16_07.tdd;

import java.util.Scanner;

import static tdd.Multiply.multiply;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int firstInput = scanner.nextInt();
        System.out.print("Enter number: ");
        int secondInput = scanner.nextInt();
        int result = power(firstInput,secondInput);
        System.out.println("Result: "+ result);
    }
    public int number ;
    public int power;

    public static int power(int number, int power){
        int result = number;
        for(int counter = 1; counter< power; counter++){
            result = multiply(result, number);
        }
        return result;
    }
}
