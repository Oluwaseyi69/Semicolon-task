package tdd.Snacks_16_07.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenatingLists {
    public static void main(String[] args) {
        int [] array1 = {0, 2, 4, 6, 8,};
        int [] array2 = {1, 3, 5, 7, 9,};
        lists(array1, array2);
    }

    private static int[] lists(int[] array1, int[] array2) {
        int lengthOfFirstArray = array1.length;
        int lengthOfSecondArray = array2.length;

        int[] newArray = {array1[lengthOfFirstArray] + array2[lengthOfSecondArray]};
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
