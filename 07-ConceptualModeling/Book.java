public class Book {

        private String title;
        private String author;
        private String genre;
        private double price;
        private int pages;
    
       
        public Book(String title, String author, String genre, double price, int pages) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.price = price;
            this.pages = pages;
        }
    
        @Override
        public String toString() {
            return "Book Details:" +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nPrice: $" + price +
                "\nPages: " + pages;
    }

}
