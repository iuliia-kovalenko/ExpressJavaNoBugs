package complex_tasks.task_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    private InventoryService inventoryService;

    @BeforeEach
    public void setUp() {
        inventoryService = new InventoryService();
    }

    @Test
    public void addProductThenGetByCategoryReturnsProductTest() {
        String category = "category1";
        Product expectedProduct = new Product("Product1", 100, category);

        inventoryService.addProduct(expectedProduct);

        assertEquals(List.of(expectedProduct), inventoryService.getProductsByCategory(category));
    }

    @Test
    public void addProductSeveralCategoriesGroupsByCategoryTest() {
        Product product1 = new Product("Milk", 100, "Food");
        Product product3 = new Product("Phone", 500, "Tech");
        Product product2 = new Product("Cookies", 300, "Food");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);

        assertEquals(List.of(product1, product2), inventoryService.getProductsByCategory("Food"));
        assertEquals(List.of(product3), inventoryService.getProductsByCategory("Tech"));
    }

    @Test
    public void getProductByPriceReturnsOnlyExactPriceTest() {
        Product product1 = new Product("Milk", 100, "Food");
        Product product3 = new Product("Phone", 100, "Tech");
        Product product2 = new Product("Cookies", 300, "Food");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);

        assertEquals(List.of(product1, product3), inventoryService.getProductByPrice(100));
    }

    @Test
    public void getProductByPriceNoMatchReturnsEmptyListTest() {
        Product product1 = new Product("Milk", 100, "Food");
        inventoryService.addProduct(product1);

        assertEquals(List.of(), inventoryService.getProductByPrice(5000));
    }

    @Test
    public void removeProductExistingProductIsRemovedTest() {
        Product product1 = new Product("Milk", 100, "Food");
        Product product3 = new Product("Phone", 100, "Tech");
        Product product2 = new Product("Cookies", 300, "Food");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);

        inventoryService.removeProduct(product1);

        assertEquals(List.of(product2), inventoryService.getProductsByCategory("Food"));
    }


    @Test
    public void removeProductEqualProductIsRemovedTest() {
        Product product1 = new Product("Milk", 100, "Food");
        Product product2 = new Product("Milk", 100, "Food");
        Product product3 = new Product("Bread", 400, "Food");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product3);

        inventoryService.removeProduct(product2);

        assertEquals(List.of(product3), inventoryService.getProductsByCategory("Food"));
    }


    @Test
    public void removeProductDuplicatesRemovesOnlyOneTest() {
        Product product1 = new Product("Milk", 100, "Food");
        Product product2 = new Product("Milk", 100, "Food");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);

        inventoryService.removeProduct(product2);

        assertEquals(List.of(product1), inventoryService.getProductsByCategory("Food"));
    }

    @Test
    public void getProductsByCategoryUnknownCategoryThrowsTest() {
        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductsByCategory("unknown");
        }, "Get product by unknown category lead to OutOfStockException");
    }

    @Test
    public void getProductsByCategoryNullThrowsTest() {
        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductsByCategory(null);
        }, "Get product by null category lead to OutOfStockException");
    }

    @Test
    public void removeProductNotInStorageThrowsTest() {
        Product product1 = new Product("Product1", 500, "category1");
        Product product2 = new Product("Product2", 3000, "category1");

        inventoryService.addProduct(product2);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.removeProduct(product1);
        }, "Removing product, that is not in storage lead to OutOfStockException");

    }

    @Test
    public void removeProductNullThrowsTest() {
        assertThrows(OutOfStockException.class, () -> {
            inventoryService.removeProduct(null);
        }, "Removing null product, that is not in storage lead to OutOfStockException");
    }


    @Test
    public void addProductClosedInventoryThrowsTest() {
        Product product = new Product("Product", 600, "category");
        inventoryService.setInventory(false);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.addProduct(product);
        }, "Closed inventory service while adding product lead to OutOfStockException");
    }

    @Test
    public void getProductsByCategoryClosedInventoryThrowsTest() {
        Product product = new Product("Product", 600, "category");
        inventoryService.addProduct(product);
        inventoryService.setInventory(false);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductsByCategory("category");
        }, "Closed inventory service while getting product by category lead to OutOfStockException");
    }

    @Test
    public void getProductByPriceClosedInventoryThrowsTest() {
        Product product = new Product("Product", 600, "category");
        inventoryService.addProduct(product);
        inventoryService.setInventory(false);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.getProductByPrice(600);
        }, "Closed inventory service while getting product by price lead to OutOfStockException");
    }

    @Test
    public void removeProductClosedInventoryThrowsTest() {
        Product product = new Product("Product", 600, "category");
        inventoryService.addProduct(product);
        inventoryService.setInventory(false);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.removeProduct(product);
        }, "Closed inventory service while removing product lead to OutOfStockException");
    }

    @Test
    public void reopenedInventoryWorksAgainTest() {
        Product product = new Product("Product", 600, "category");
        inventoryService.setInventory(false);
        inventoryService.setInventory(true);
        inventoryService.addProduct(product);

        assertEquals(List.of(product), inventoryService.getProductsByCategory("category"));
    }

    @Test
    public void addProductClosedInventoryDoesNotAddProductTest() {
        Product product1 = new Product("Product1", 600, "category1");
        Product product2 = new Product("Product2", 600, "category1");
        inventoryService.setInventory(false);

        assertThrows(OutOfStockException.class, () -> {
            inventoryService.addProduct(product1);
        }, "Closed inventory service while adding product lead to OutOfStockException");

        inventoryService.setInventory(true);
        inventoryService.addProduct(product2);
        assertEquals(List.of(product2), inventoryService.getProductsByCategory("category1"));
    }
}
