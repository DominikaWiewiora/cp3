public class MyCalendar {
    static int year = 2024;
    static int month = 1;
    static int day = 1;

    static String myDate(){
        return String.format("%4d-%02d-%02d",year,month,day);
    }

    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(monthName());
    }
    
    static String monthName() {
        String [] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month-1];
    }

    static int day() {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        

    }
    

}
