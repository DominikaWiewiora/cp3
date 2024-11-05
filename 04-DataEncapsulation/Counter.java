public class Counter {

    private int value;

    

    public Counter(int value) {
        this.value = value=0;
    }



    public void increase() {
        this.value++;
    }


    public void decrease() {
        this.value--;
    }

    public void increase(int n) {
        this.value = value+n ;
    }

    public void decrease(int n) {
        this.value = value - n;
    }

    public int value() { 
        return this.value;
    }

    public static void main(String[] args) {
        Counter c = new Counter(0);
        System.out.println(c.value);
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value);


    }
    
}
