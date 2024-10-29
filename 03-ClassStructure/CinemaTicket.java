public class CinemaTicket {
    static String cinemaName = "...";
    String filmTitle = "...";
    int row;
    int seat;
    float price;


    public CinemaTicket(String filmTitle, int row, int seat,float price) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    @Override
    public String toString() {
        return 
               "Cinema Name: " + cinemaName + "\n" +
               "Film Title: " + filmTitle + "\n" +
               "Row: " + row + "\n" +
               "Seat: " + seat + "\n" +
               "Price: $" + price;
    }

    public static void main(String[] args) {
        
        CinemaTicket ticket1 = new CinemaTicket("Inception", 5, 12, 12.50f);
        CinemaTicket ticket2 = new CinemaTicket("Avatar", 3, 8, 15.00f);

       
        System.out.println(ticket1); 
        System.out.println();        
        System.out.println(ticket2); 
    }
    
}
