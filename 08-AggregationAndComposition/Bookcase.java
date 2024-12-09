import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books;


    

    public Bookcase() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBookshelf() {
        System.out.println("Books on the shelf: ");
        for (Book b : books) {
            System.out.println(b);
        }
    }

}
