package CS116Lab7;

public class PCBasedGame extends Game {

    private int minRam;
    private int minStorage;
    private int minCpuSpeed;

    public PCBasedGame(String description, int minRam, int minStorage, int minCpuSpeed, double v){
        super(description);
        setMinRam(minRam);
        setMinStorage(minStorage);
        setMinCpuSpeed(minCpuSpeed);
    }
    public int getMinRam(){
        return minRam;
    }
    public void setMinRam(int newMinRam){
        minRam = newMinRam;
    }
    public int getMinStorage(){
        return minStorage;
    }
    public void setMinStorage(int newMinStorage){
        minStorage = newMinStorage;
    }
    public int getMinCpuSpeed(){
        return minCpuSpeed;
    }
    public void setMinCpuSpeed(int newMinCpuSpeed){
        minCpuSpeed = newMinCpuSpeed;
    }

    public void play(){
        System.out.println("PCBasedGame play");
    }
    public void minimumRequirements() {
        System.out.println("PCBasedGame minimumRequirements");
    }
    public String toString(){
        return (super.toString() + " MinRam: " + minRam + " MinStorage: " + minStorage + " MinCpuSpeed: " + minCpuSpeed);
    }

}
