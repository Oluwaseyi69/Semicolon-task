package tdd.Snacks_16_07.tdd;

import java.util.List;

public class OddPositions {
    public static void main(String[] args) {
        List<String> names = List.of("Seyi", "Temitope", "Food", "Tomide");
        printOddPositionElements(names);
    }
    public static <T> void printOddPositionElements(List<T> list){
        for(int i =0; i < list.size(); i++){
            if(i % 2 != 0){
                System.out.println(list.get(i));
            }
        }
    }
}
