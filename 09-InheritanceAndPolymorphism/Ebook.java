public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("This is an Ebook");
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("File name: "+getFileName());
    }
}
