package CS116Lab5;

import java.util.ArrayList;

public class ComputerKit {

    private ArrayList<ComputerPart> parts;
    //private ComputerPart part;

    public ArrayList<ComputerPart> getParts(){
       return parts;
    }
    public void setParts(ArrayList<ComputerPart> parts){
        this.parts = parts;
    }

    public ComputerKit() {
        parts = new ArrayList<ComputerPart>();
    }

    public void addComputerPart(ComputerPart part) {
        parts.add(part);
    }
    public String expensive() {
        double total = 0;
        for (ComputerPart part : parts) {
            total += part.getPriceOfItem();
        }

        if (total > 1000) {
            return ("This item is expensive");

        } else if (total < 250) {
            return ("This item is cheap");
        } else if (total >= 250 && total <= 1000) {
            return ("This item is moderately priced");
        }
        return null;
    }


    public  boolean contains(String item) {
        for (int i = 0; i < parts.size(); i++) {
            if (parts.get(i).getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }
    public int countItem(String item){
        int count = 0;
        for (int i = 0; i < parts.size(); i++){
            if (parts.get(i).equals(item)){
                count++;
            }
        }
        return count;
    }
}
