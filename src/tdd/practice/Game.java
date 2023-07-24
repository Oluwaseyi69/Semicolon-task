package tdd.practice;

public class Game {
    public static void main(String[] args) {
        String[][] games = new String[][]{
                {"x", "o", "x"}, {"o", "o", "x"}, {"o", "x", "x"}
        };
        for (int count = 0; count < games.length; count++) {
            for (int index = 0; index < games[count].length; index++) {
                System.out.print(games[count][index] + " ");
            }
            System.out.println();
        }

}
}