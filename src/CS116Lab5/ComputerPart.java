package CS116Lab5;

public class ComputerPart {

    private String item;
    private double priceOfItem;

    public void expensive(){
        if (priceOfItem > 1000){
            System.out.println("This item is expensive");

        }
        else if (priceOfItem < 250){
            System.out.println("This item is cheap");
        }
        else if(priceOfItem >= 250 && priceOfItem <= 1000){
            System.out.println("This item is moderately priced");
        }
    }

    public void addComputerPart(ComputerPart part){
        if ()


    }


}
