package tdd.practice;

public class TicTacToe {
    public static void main(String[] args) {

        String[][] games = new String[][]{
                {"x", "o", "x"}, {"x", "o", "x"}, {"o", "x", "x"}
        };

        for (int count = 0; count < games.length; count++) {
            for (int index = 0; index < games[count].length; index++) {
                if (games[count][index].equals("x")){
                    games[count][index] = "1";
                }
                if (games[count][index].equals("o")){
                    games[count][index] = "0";
                }
                System.out.print(games[count][index] + " ");
            }
            System.out.println();
        }
    }
}

