public class Audiobook extends Book{
    private int minutes;
    private int seconds;


   
    

    public Audiobook(String title, Writer author, Publisher publisher, int yearOfPublication, int minutes,
            int seconds) {
        super(title, author, publisher, yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    





    public int getMinutes() {
        return minutes;
    }







    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }







    public int getSeconds() {
        return seconds;
    }







    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getDuration() {
        return minutes+":"+seconds;
    }







    public void display() {
        System.out.println("This is an Audiobook");
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Duration: "+getDuration());
        System.out.println(getPublisher());
        System.out.println("Year of publication: "+getYearOfPublication());
    }
}
