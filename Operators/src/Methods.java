public class Methods {

    public static void main(String[] args) {

        displayHighScorePosition("Charlie", calculateHighScorePosition(1500));

        displayHighScorePosition("Charlie", calculateHighScorePosition(900));

        displayHighScorePosition("Charlie", calculateHighScorePosition(400));

        displayHighScorePosition("Charlie", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int highScorePostion) {

        System.out.println(playerName + " managed to get into position " + highScorePostion + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {

        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else  if (score > 100 && score < 500) {
            return 3;
        }

        return 4;
    }
}
