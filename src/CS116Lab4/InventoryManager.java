package CS116Lab4;

public class InventoryManager {

    private Product[] products;
    private int numProducts;
    private int maxProd;

    public InventoryManager(int maxProd){
        this.maxProd = maxProd;
        this.products = new Product[maxProd];
        this.numProducts = 0;

    }
    public void addProduct(Product products){
        //add product to array
        if(numProducts < maxProd){
            this.products[numProducts] = products;
            numProducts++;
        }
        else{
            System.out.println("Inventory is full");
        }

    }
    public Product findProduct(int productID){
        //find product in array
        for(int i = 0; i < numProducts; i++){
            if(products[i].getProductID() == productID){
                return products[i];
            }
        }
        return null;
    }
    public void displayProducts(){
        //display products in array
        for(int i = 0; i < numProducts; i++){
            System.out.println(products[i]);
        }
    }
    public void ascendSortProducts(int [] products){
        //sort products by ascending order
            for (int i = 0; i < products.length - 1; i++) {
                //start at 0 index and go to last index
                int minIndex = i;
                //set min index to ith element
                for (int j = i + 1; j < products.length; j++) {
                    //i+1 represents the next index next to the minIndex
                    if (products[j] < products[minIndex]) {
                        //if the next element j is smaller than minIndex, swap them
                        minIndex = j;
                    }
                }
                int temp = products[minIndex];
                products[minIndex] = products[i];
                products[i] = temp;
                //simple swap algorithm
            }
        }
        public int binarySearch(int productID) {
            //binary search for productID
            int[] productIDs = new int[numProducts];
            for (int i = 0; i < numProducts; i++) {
                productIDs[i] = products[i].getProductID();
            }

            int l = 0;
            int r = numProducts - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (productIDs[mid] == productID) {
                    return mid;
                }
                if (productIDs[mid] < productID) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return -1;
        }
}

