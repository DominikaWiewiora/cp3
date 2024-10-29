public class CinemaTicket2 {
    static String cinemaName = "Morning Star Cinema"; 
    String filmTitle;   
    int row;           
    int seat;          
    double price;      

   
    public CinemaTicket2(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;

       
        if (row <= 2) {
            this.price = 10.0;
        } else {
            this.price = 25.0; 
        }
    }

   
    @Override
    public String toString() {
        return "Cinema: " + cinemaName +
               "\nFilm: " + filmTitle +
               "\nRow: " + row +
               "\nSeat: " + seat +
               "\nPrice: PLN " + price;
    }

    public static void main(String[] args) {
        
        CinemaTicket2 ticket1 = new CinemaTicket2("Gladiator", 2, 5);
        CinemaTicket2 ticket2 = new CinemaTicket2("Gladiator", 7, 10); 

        
        System.out.println(ticket1);
        System.out.println();
        System.out.println(ticket2);
    }
}

