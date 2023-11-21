package CS116Lab7;

public class BoardGame extends Game {
    private int numPlayers;
    private boolean canEndInTie;

    public BoardGame(String description, int numPlayers, int i, boolean canEndInTie) {
        super(description);
        setNumPlayers(numPlayers);
        setCanEndInTie(canEndInTie);
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public void setNumPlayers(int newNumPlayers) {
        numPlayers = newNumPlayers;
    }
    public boolean getCanEndInTie() {
        return canEndInTie;
    }
    public void setCanEndInTie(boolean newCanEndInTie) {
        canEndInTie = newCanEndInTie;
    }
    public void play() {
        System.out.println("BoardGame play");
    }
    public void endGame() {
        System.out.println("BoardGame endGame");
    }
    public String toString() {
        return (super.toString() + " NumPlayers: " + numPlayers + " CanEndInTie: " + canEndInTie);
    }
}
