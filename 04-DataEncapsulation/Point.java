public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isX() {
        return this.x == 0;
    }

    public boolean isY() {
        return this.y == 0;
    }

    public String toString() {
        return "P("+x+","+y+")";
    }
    
    public static void main(String[] args) {
        Point point = new Point(3, 0);
        System.out.println(point.isX());
        System.out.println(point.isY());
        System.out.println(point.toString());
        
    }
    
}
