package tdd.Snacks_16_07.tdd;

public class Fibonacci {
  public static int[] fibonacci(int number){
      int [] fibonacci = new int[number];
      fibonacci[0] = 0;
      if(number > 1){
          fibonacci[1]=1;
          for(int counter = 2; counter < number; counter++ ){
              fibonacci[counter] = fibonacci[counter - 1];
          }
      }
      return fibonacci;
  }

}