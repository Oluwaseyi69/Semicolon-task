package tdd.Snacks_16_07.tdd;

public class Fibonacci {
//  public static int[] fibonacci(int number){
//      int [] fibonacci = new int[number];
//      fibonacci[0] = 0;
//      if(number > 1){
//          fibonacci[1]=1;
//          for(int counter = 2; counter < number; counter++ ){
//              fibonacci[counter] = fibonacci[counter - 1];
//          }
//      }
//      return fibonacci;
//  }
public static void main(String[] args) {
    int n = 10;
    int [] fib = new int[n];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i < n; i++){
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    System.out.println("Fibonacci");
    for (int num : fib){
        System.out.println(num + " ");
    }
}

}