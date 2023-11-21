package CS116Lab7;

public class SportsGame extends Game{

    private boolean isTeamGame;
    private boolean canEndInTie;

    public SportsGame(String description, int i, boolean isTeamGame, boolean canEndInTie){
        super(description);
        setIsTeamGame(isTeamGame);
        setCanEndInTie(canEndInTie);
    }
    public boolean getIsTeamGame(){
        return isTeamGame;
    }
    public void setIsTeamGame(boolean newIsTeamGame){
        isTeamGame = newIsTeamGame;
    }
    public boolean getCanEndInTie(){
        return canEndInTie;
    }
    public void setCanEndInTie(boolean newCanEndInTie){
        canEndInTie = newCanEndInTie;
    }
    public void play(){
        System.out.println("SportsGame play");
    }
    public void endGame(){
        System.out.println("SportsGame endGame");
    }
    public String toString(){
        return (super.toString() + " IsTeamGame: " + isTeamGame + " CanEndInTie: " + canEndInTie);
    }

}
