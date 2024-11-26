public class Product {
    private String name;
    private double price;
    private int quantityAvailable;

  
    public Product(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    
    public void updateQuantity(int change) {
        this.quantityAvailable += change;
    }

   
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantityAvailable() { return quantityAvailable; }


    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantityAvailable=" + quantityAvailable + "}";
    }
}

