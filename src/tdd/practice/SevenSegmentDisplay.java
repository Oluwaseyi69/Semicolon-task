package tdd.practice;

public class SevenSegmentDisplay {
    public static void segment(String segment) {

        String[][] sevenSegment = {{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}};
        for (int index = 0; index < sevenSegment.length; index++) {
            for (int count = 0; count < sevenSegment[index].length; count++) {
                if (segment.charAt(7) == '1') {
                    if (segment.charAt(0) == '0') {
                        sevenSegment[0][1] = " ";
                        sevenSegment[0][2] = " ";
                    }
                    if (segment.charAt(1) == '0') {
                        sevenSegment[1][3] = " ";
                    }
                    if (segment.charAt(2) == '0') {
                        sevenSegment[3][3] = " ";
                    }
                    if (segment.charAt(3) == '0') {
                        sevenSegment[4][0] = " ";
                        sevenSegment[4][1] = " ";
                        sevenSegment[4][2] = " ";
                    }
                    if (segment.charAt(4) == '0') {
                        sevenSegment[3][0] = " ";
                    }
                    if (segment.charAt(5) == '0') {
                        sevenSegment[1][0] = " ";
                    }
                    if (segment.charAt(6) == '0') {
                        sevenSegment[2][0] = " ";
                        sevenSegment[2][1] = " ";
                        sevenSegment[2][2] = " ";
                    }
                    System.out.print(sevenSegment[index][count] + " ");
                }



            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        segment("11011010");

        System.out.println();
    }
}