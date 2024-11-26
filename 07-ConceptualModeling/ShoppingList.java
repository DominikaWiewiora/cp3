import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> products = new ArrayList<>();

    public void displayList() {
        System.out.println("Shopping List: " + (products.isEmpty() ? "No items." : products));
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();

        list.displayList();
        System.out.println("Products to buy: " + list.getNumberOfProducts());

       
        list.addProduct("Milk");
        list.addProduct("Bread");
        list.addProduct("Eggs");
        list.displayList();
        System.out.println("Products to buy: " + list.getNumberOfProducts());

       
        list.addProduct("Butter");
        list.displayList();
        System.out.println("Products to buy: " + list.getNumberOfProducts());
        ShoppingList listin = new ShoppingList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter products for the shopping list (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            list.addProduct(input);
        }

        list.displayList();
        scanner.close();
    }
    
    
}