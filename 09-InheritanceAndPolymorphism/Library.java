public class Library {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void displayBooks() {
        for (Book b: books) {
            System.out.println();
        }
    }
}
