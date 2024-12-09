public class Book {
    private String title;
    private Writer author;
    private Publisher publisher;
    private int yearOfPublication;

    



    public Book(String title, Writer author, Publisher publisher, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }


    
    
     public String getTitle() {
        return title;
    }




    public void setTitle(String title) {
        this.title = title;
    }




    public Writer getAuthor() {
        return author;
    }




    public void setAuthor(Writer author) {
        this.author = author;
    }




    public Publisher getPublisher() {
        return publisher;
    }




    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }




    public int getYearOfPublication() {
        return yearOfPublication;
    }




    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }




    public void display() {
        System.out.println("This is a traditional book");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println(publisher);
        System.out.println("Year of publication: "+yearOfPublication);
    } 
}