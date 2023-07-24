package tdd.Snacks_16_07.tdd;

import java.util.ArrayList;
import java.util.List;

public class ElementCheck {

    public static int[] checkElement(int search, int... number_list) {
        int newCounter = 0;

        for (int counter = 0; counter < number_list.length; counter++) {
            if(search == number_list[counter])continue;
            number_list[newCounter] =number_list[counter];
            newCounter++;
        }
        int[] number = new int[newCounter];
        for (int counter = 0; counter < number_list.length; counter++) {
            if(search == number_list[counter]) return number_list;
        }
        return number;
    }
}
