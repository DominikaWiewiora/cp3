public class Clock {
    private int hour;
    private int minute;

    
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }


    public int getHour() {
        return hour;
    }


    public int getMinute() {
        return minute;
    }


    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23 ) {
            this.hour = hour;
        }
    }


    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public void addMinute() {
        this.minute++;
        if (this.minute >= 60) { 
            this.minute = 0;
            this.hour++;
            if (this.hour >= 24) {
                this.hour = 0;
            }
        }
    }

    public String toString() {
        return "Hour: "+hour+" Minute: "+minute;
    }

    public static void main(String[] args) {
        Clock clock = new Clock(10, 24);
        System.out.println(clock.toString());
    }
}
