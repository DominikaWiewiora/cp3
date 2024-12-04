public class Main {
    public static void main(String[] args) {
        
        Writer writer = new Writer("Mark", "Smith", 40);

       
        Book book = new Book(writer, "Title", 100, "Drama");

     
        Chapter chapter1 = new Chapter("Chapter 1: First", 1);
        Chapter chapter2 = new Chapter("Chapter 2: Second", 2);
        Chapter chapter3 = new Chapter("Chapter 3: Third", 3);

      
        book.addChapter(chapter1);
        book.addChapter(chapter2);
        book.addChapter(chapter3);

     
        chapter1.setContent("This chapter introduces the protagonist...");
        chapter2.setContent("The conflict arises in this chapter...");
        chapter3.setContent("The resolution happens here...");

    
        System.out.println(book);
    }
}
