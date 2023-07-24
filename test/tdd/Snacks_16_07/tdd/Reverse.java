package tdd.Snacks_16_07.tdd;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original list: "+ numbers);
        reverseList(numbers);
        System.out.println("Reversed list: "+ numbers);

    }
    public static void reverseList(List<?> list){
        int size = list.size();
        for(int i = 0; i < size / 2; i++){
            int j = size - i-1;
            swap(list, i, j);
        }
    }

}
