public class NestedLoops {
    public static void main(String[] args) {
        triangle(8);
    }
    public static void triangle(int number) {

            for (int y = 0; y < number; y++) {
                for (int z = 0; z < y + 1; z++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                for (int z = 0; z < (number - y + 1); z++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
                for (int z = 0; z < (number - y + 1); z++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                for (int z = 0; z < (y + 1); z++) {
                    System.out.print(" ");
                }
                for (int z = 0; z < (y + 1); z++) {
                    System.out.print(" ");
                }
                for (int z = 0; z < (number - y + 1); z++) {
                    System.out.print("*");

                }
                System.out.print(" ");
                for (int z = 0; z < (number - y + 1); z++) {
                    System.out.print(" ");
                }
                for (int z = 0; z < (y + 1); z++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
