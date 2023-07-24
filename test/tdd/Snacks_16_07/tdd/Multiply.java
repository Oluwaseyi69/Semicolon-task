package tdd.Snacks_16_07.tdd;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int firstInput = scanner.nextInt();
        System.out.print("Enter number: ");
        int secondInput = scanner.nextInt();
        int result = multiply(firstInput,secondInput);
        System.out.println("Result: "+ result);
    }
    public int number1;
    public int number2;
    public static int multiply(int number1, int number2){
        int total = 0;
        for(int counter = 0; counter < number2; counter++){
            total+= number1;
            if(number2 <= 0){
                return total;
            }

        }
        return total;

    }
    private int absolute(int number){
        String num = ""+number;
        if(num.contains("-")) num = num.substring(1);
        return Integer.parseInt(num);
    }
    public static  int power(int number, int power){
        int result = 0;
        for(int counter = 1; counter < power; counter++){
            result = multiply(result, number);
        }
        return result;
    }
}
