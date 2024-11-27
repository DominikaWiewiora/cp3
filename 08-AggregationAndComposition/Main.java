public class Main {
    public static void main(String[] args) {

        Writer writer = new Writer("Mark", "Smith", 40);

        Book book = new Book(writer, "Book", 100, "drama");

        System.out.println(book);

        

        
    }
}
