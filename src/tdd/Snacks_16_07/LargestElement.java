package tdd.Snacks_16_07;


public class LargestElement {

    public int getLargestElement;
    public static int [] numbers;
    public int element;


    public int getLargestElement(int [] numbers) {
        if(numbers.length == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        int largestElement = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largestElement){
                largestElement = numbers[i];
            }
        }
       return largestElement;
    }

}