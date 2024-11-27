public class Book {
    private Writer writer;
    private String title;
    private int numOfPages;
    private String genre;


    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(Writer writer, String title, int numOfPages, String genre) {
        this.writer = writer;
        this.title = title;
        this.numOfPages = numOfPages;
        this.genre = genre;
    }

    public String toString() {
        return  "Book title: "+title+"\n"+
                "Book author: "+writer+"\n"+
                "Number of pages: "+numOfPages+"\n"+
                "Book genre: "+genre;

    }



    //not array for chapters use arraylist
    //class chapter - connection btw book and chapter

    
}