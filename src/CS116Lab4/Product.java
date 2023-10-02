package CS116Lab4;

public class Product {
    int productID;
    String productName;
    double productPrice;
    int quantityinStock;
    public Product(int productID, String productName, double productPrice, int quantityinStock){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantityinStock = quantityinStock;
    }
    public int getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public int getQuantityinStock(){
        return quantityinStock;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void setQuantityinStock(int quantityinStock) {
        this.quantityinStock = quantityinStock;
    }
    public boolean equals(Product p){
        if (this.productID == p.productID){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Product{" + "productID=" + productID +
                ", productName=" + productName +
                ", productPrice=" + productPrice +
                ", quantityinStock=" + quantityinStock + '}';
    }

}
