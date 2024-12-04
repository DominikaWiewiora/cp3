import java.util.ArrayList;

public class Book {
    private Writer writer;  
    private String title;
    private int numOfPages;
    private String genre;
    private ArrayList<Chapter> chapters;

    
    public Book(Writer writer, String title, int numOfPages, String genre) {
        this.writer = writer;
        this.title = title;
        this.numOfPages = numOfPages;
        this.genre = genre;
        this.chapters = new ArrayList<>();  
    }

   
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

   
    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    
    public void removeChapter(Chapter chapter) {
        chapters.remove(chapter);
    }

  
    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

   
    @Override
    public String toString() {
        StringBuilder bookInfo = new StringBuilder();
        bookInfo.append("Book title: ").append(title).append("\n")
                .append("Book author: ").append(writer).append("\n")
                .append("Number of pages: ").append(numOfPages).append("\n")
                .append("Book genre: ").append(genre).append("\n")
                .append("Chapters: ").append("\n");

        
        for (Chapter chapter : chapters) {
            bookInfo.append("  - ").append(chapter.getTitle()).append("\n");
        }

        return bookInfo.toString();
    }
}
