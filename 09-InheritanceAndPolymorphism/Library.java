public class Library {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void displayBooks() {
        for (Book b : books) {
            // Call the display() method of each book
            b.display();
            System.out.println(); // Add a blank line for better readability
        }
    }
}
