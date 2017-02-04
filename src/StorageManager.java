import java.util.ArrayList;

class StorageManager {
    private StoreCapable storage;

    void addStorage(StoreCapable storage) {
        this.storage = storage;
    }

    void addCDProduct(String name, int price, int tracks) {
        storage.storeCDProduct(name, price, tracks);
    }

    void addBookProduct(String name, int price, int size) {
        storage.storeBookProduct(name, price, size);
    }

    String listProducts() {
        ArrayList<Product> listToPrint = ((Store) storage).loadProducts();
        for (Product product : listToPrint) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        return "Products loaded to list";
    }

    int getTotalProductPrice() {
        int totalPrice = 0;
        ArrayList<Product> products = ((PersistentStore) storage).getProductArrayList();
        for (Product i : products) {
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}
