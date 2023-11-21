package CS116Lab10;

public class DigitalCamera implements Camera {
    //Digital Camera takes 2000 photos
    private int numberOfPictures = 2000;
    public int numberOfPictures(){
        return numberOfPictures;
    }
    public String takePicture(){
        return "Digital Camera: Click!";
    }
    
}
