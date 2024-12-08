public class Main {
    public static void main(String[] args) {
        
        Writer writer1 = new Writer("Patryk", "Taki", "drama");
        Publisher publisher1 = new Publisher("Stefan", "Cityy1");
        Book book1 = new Book("BookTitle1", writer1, publisher1, 2000);
        Ebook ebook1 = new Ebook("ebok1", writer1, publisher1, 2001, "file1");
        Audiobook audiobook1 = new Audiobook("Audiobook1", writer1, publisher1, 2003, 90, 13);
     

       
    

        Book[] b = new Book[3];

        b[0] = book1;
        b[1] = ebook1;
        b[2] = audiobook1;


        Library library1 = new Library();
        library1.setBooks(b);
        
        library1.displayBooks();
    }
}
