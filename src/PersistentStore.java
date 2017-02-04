import java.util.ArrayList;

public class PersistentStore extends Store {
    private ArrayList<Product> productArrayList = new ArrayList<>();

    ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void storeProduct(Product product) {
        productArrayList.add(product);
    }

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products = getProductArrayList();
        return products;
    }

}
