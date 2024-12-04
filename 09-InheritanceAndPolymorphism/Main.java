public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("BookTitle1", "Author Firts");
        
        
        Ebook ebook1 = new Ebook("EbookTitle1", "Mark Smith", "File1");
     

        Audiobook audiobook1 = new Audiobook("Audiobook1", "AnnaSmith", 60, 20);
    

        Book[] b = new Book[3];

        b[0] = book1;
        b[1] = ebook1;
        b[2] = audiobook1;


        Library library1 = new Library();
        library1.setBooks(b);
        
        library1.displayBooks();
    }
}
