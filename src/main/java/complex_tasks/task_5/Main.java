package complex_tasks.task_5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("name1", 100, "category1");
        Product product2 = new Product("name2", 500, "category1");
        Product product3 = new Product("name3", 45, "category2");
        Product product4 = new Product("name4", 45, "category3");
        Product productPhantom = new Product("phantom", 45, "category3");

        InventoryService inventoryService = new InventoryService();
        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);

        inventoryService.printAllProducts();
        inventoryService.setInventory(false);

        try {
            inventoryService.addProduct(product4);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        inventoryService.setInventory(true);

        inventoryService.addProduct(product4);
        inventoryService.printAllProducts();

        System.out.println(inventoryService.getProductByPrice(45));
        System.out.println(inventoryService.getProductsByCategory("category3"));

        System.out.println(inventoryService.getProductByPrice(1000));

        try {
            System.out.println(inventoryService.getProductsByCategory("category"));
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------Before remove---------");
        inventoryService.printAllProducts();
        inventoryService.removeProduct(product3);
        System.out.println("-----------After remove---------");
        inventoryService.printAllProducts();
        System.out.println("-----------Remove product, which is not in storage---------");
        try {
            inventoryService.removeProduct(productPhantom);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}