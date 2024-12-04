public class Chapter {
    private String title;
    private int number;
    private String content;

    
    public Chapter(String title, int number) {
        this.title = title;
        this.number = number;
        this.content = "";  
    }

   
    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
