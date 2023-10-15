package CS116Lab4;

public class InventoryManager {

    private Product[] products;
    //create array of products
    private int numProducts;
    private int maxProd;

    public InventoryManager(int maxProd){
        //constructor
        this.maxProd = maxProd;
        //set maxProd to maxProd
        this.products = new Product[maxProd];
        //create new array of products
        this.numProducts = 0;
        //set numProducts to 0

    }
    public void addProduct(Product products){
        //add product to array
        if(numProducts < maxProd){
            //if numProducts is less than maxProd, add product to array
            this.products[numProducts] = products;
            //add product to array
            numProducts++;
            //increment numProducts
        }
        else{

            System.out.println("Inventory is full");
        }

    }
    public Product findProduct(int productID){
        //find product in array
        for(int i = 0; i < numProducts; i++){
            //loop through array
            if(products[i].getProductID() == productID){
                //if productID matches, return product
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
                products[i]= products[minIndex];
                products[i] = temp;
                //simple swap algorithm
            }
        }
        public int binarySearch(int productID) {
            //binary search for productID
            int[] productIDs = new int[numProducts];
            //create array of productIDs
            for (int i = 0; i < numProducts; i++) {
                //loop through products array and add productIDs to new array
                productIDs[i] = products[i].getProductID();
                //add productIDs to new array
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

