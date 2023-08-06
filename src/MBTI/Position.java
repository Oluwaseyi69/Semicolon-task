package MBTI;

public class Position {
    private int highest;
//    private static int[] array;

//    public static void main(String[] args) {
//        Position position = new Position();
//    }

    public static int[] position(int... originalArray) {
        int[] array = new int[originalArray.length];
        System.arraycopy(originalArray, 0, array, 0, originalArray.length);
        int temp = 0;
        int[] positionArray = new int[0];
        for (int index = 0; index < array.length; index++) {
            for (int newIndex = 0; newIndex < array.length; newIndex++) {
                if (array[index] < array[newIndex]) {
                    temp = array[index];
                    array[index] = array[newIndex];
                    array[newIndex] = temp;
                }
            }
            positionArray = new int[]{0};
            for (int newIndex = 0; newIndex < array.length; newIndex++) {
                if (originalArray[newIndex] == array[index]) {

                    positionArray[newIndex] = index + 1;
                }
            }
        }
        return positionArray;

    }


}
