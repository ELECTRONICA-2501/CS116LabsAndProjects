package CS116Lab5;

public class ComputerPart {

    private String item;
    private double priceOfItem;

    public String getItem(){
        return item;
    }
    public double getPriceOfItem(){
        return priceOfItem;
    }

    public void setItem(String item){
        this.item = item;
    }
    public void setPriceOfItem(double priceOfItem){
        this.priceOfItem = priceOfItem;
    }
    public ComputerPart(String item, double priceOfItem){
        this.item = item;
        this.priceOfItem = priceOfItem;
    }

    //a method returning how many times a particular item is found in the list of parts.


    /*public void addComputerPart(ComputerPart part){
        if ()
    }*/


}
