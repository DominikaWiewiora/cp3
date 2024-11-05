public class Product {
    private String productName = "Meat";
    private boolean isVegeterian = false;

    
    public String getProductName() {
        return productName;
    }
    public boolean isVegeterian() {
        return isVegeterian;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setVegeterian(boolean isVegeterian) {
        this.isVegeterian = isVegeterian;
    }

    public String toString() {
        return "Product name: "+productName+"\n"+
               "Is product vegeterian? "+isVegeterian;
    }

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.toString());
    }
}
