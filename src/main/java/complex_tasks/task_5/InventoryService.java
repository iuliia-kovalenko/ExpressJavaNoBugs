package complex_tasks.task_5;

import java.util.*;

public class InventoryService {
    private boolean isInventoryOpen = true;
    private Map<String, List<Product>> productStorage = new LinkedHashMap<>();

    public void setInventory(boolean flag) {
        isInventoryOpen = flag;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Not possible to add product");
        }
        if (product == null) {
            throw new OutOfStockException("Product can not be null");
        }
        productStorage.putIfAbsent(product.getCategory(), new ArrayList<>());
        productStorage.get(product.getCategory()).add(product);
    }

    public List<Product> getProductsByCategory(String category) {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Not possible to add product");
        }
        if (category == null) {
            throw new OutOfStockException("Category can not be null");
        }
        if (!productStorage.containsKey(category)) {
            throw new OutOfStockException("Category was not found");
        }
        return productStorage.get(category);
    }

    public List<Product> getProductByPrice(int price) {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Not possible to add product");
        }
        return productStorage.values()
                .stream() //stream List<Product>
                .flatMap(Collection::stream)
                .filter(product -> product.getPrice() == price)
                .toList();
    }

    public void removeProduct(Product product) {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Not possible to add product");
        }
        if (product == null) {
            throw new OutOfStockException("Product can not be null");
        }
        if (!productStorage.get(product.getCategory()).remove(product)) {
            throw new OutOfStockException("Product: " + product + " was not in the storage");
        }
    }
    public void printAllProducts() {
        productStorage.forEach((k, v) ->
                System.out.println("Category: " + k + ", Products: " + v));
    }
}
