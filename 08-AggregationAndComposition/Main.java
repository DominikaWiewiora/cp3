public class Main {
    public static void main(String[] args) {
        
        Writer writer = new Writer("Mark", "Smith", 40);

       
        Book book1 = new Book(writer, "Title", 100, "Drama");

     
        Chapter chapter1 = new Chapter("Chapter 1: First", 1);
        Chapter chapter2 = new Chapter("Chapter 2: Second", 2);
        Chapter chapter3 = new Chapter("Chapter 3: Third", 3);

      
        book1.addChapter(chapter1);
        book1.addChapter(chapter2);
        book1.addChapter(chapter3);

     
        chapter1.setContent("This chapter introduces the protagonist...");
        chapter2.setContent("The conflict arises in this chapter...");
        chapter3.setContent("The resolution happens here...");



        Book book2 = new Book(writer, "Title2 ", 300, "history");

        Bookcase bookshelf = new Bookcase();

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);

        bookshelf.displayBookshelf();

        bookshelf.removeBook(book2);

        bookshelf.displayBookshelf();

    }
}
