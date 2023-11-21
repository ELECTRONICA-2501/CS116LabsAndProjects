package CS116Lab7;

public class PCBasedGame extends Game {

    public PCBasedGame(String newDescription) {
        super(newDescription);
    }
    public PCBasedGame(){
        super();
    }
    public void play(){
        System.out.println("PCBasedGame play");
    }
    public void minimumRequirements(){
        System.out.println("PCBasedGame minimumRequirements");
    }
    public
    public String toString(){
        return ( "PCBasedGame: " + description);
    }


}
