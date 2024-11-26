import java.util.ArrayList;
import java.util.List;

public class Seller {
    private String name;
    private String location;
    private List<Product> inventory;

    
    public Seller(String name, String location) {
        this.name = name;
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    
    public void addProduct(Product product) {
        inventory.add(product);
    }

    
    public void updateInventory(Product product, int newQuantity) {
        for (Product p : inventory) {
            if (p.getName().equals(product.getName())) {
                p.updateQuantity(newQuantity - p.getQuantityAvailable());
                return;
            }
        }
    }

   
    public void displayInventory() {
        System.out.println("Seller Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

  
    public boolean sellProduct(Product product, int quantity) {
        for (Product p : inventory) {
            if (p.getName().equals(product.getName()) && p.getQuantityAvailable() >= quantity) {
                p.updateQuantity(-quantity);
                return true;
            }
        }
        return false;
    }
}

