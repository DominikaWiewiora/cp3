public class SalesSystemTest {
    public static void main(String[] args) {
       
        Seller seller = new Seller("Bookstore Inc.", "Downtown");

      
        seller.addProduct(new Product("Book A", 15.99, 10));
        seller.addProduct(new Product("Book B", 25.49, 5));
        seller.addProduct(new Product("Notebook", 5.99, 20));

      
        seller.displayInventory();

        
        Customer customer = new Customer("Anna", "ace@smth.com");

       
        customer.addToCart(new Product("Book A", 15.99, 2), 2);
        customer.addToCart(new Product("Notebook", 5.99, 1), 1);

        customer.viewCart();

      
        double total = customer.checkout(seller);
        System.out.println("Total Amount Paid: $" + total);

      
        seller.displayInventory();
    }
}

