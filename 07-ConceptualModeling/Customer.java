import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String contactInfo;
    private List<Product> cart;

   
    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.cart = new ArrayList<>();
    }

   
    public void addToCart(Product product, int quantity) {
        cart.add(new Product(product.getName(), product.getPrice(), quantity));
    }

   
    public void viewCart() {
        System.out.println("Customer Cart:");
        for (Product product : cart) {
            System.out.println(product);
        }
    }

  
    public double checkout(Seller seller) {
        double total = 0.0;
        for (Product product : cart) {
            if (seller.sellProduct(product, product.getQuantityAvailable())) {
                total += product.getPrice() * product.getQuantityAvailable();
            } else {
                System.out.println("Product not available: " + product.getName());
            }
        }
        cart.clear(); 
        return total;
    }
}
