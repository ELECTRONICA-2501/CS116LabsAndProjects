package CS116Lab7;

public class BoardGame extends Game {
    int numPlayers;

    public BoardGame(String newDescription) {
        super(newDescription);

    }

    public boolean tieGame() {
        if (tieGame() == true) {
            System.out.println("Tie Game");
        } else {
            return false;
        }
    }
}
