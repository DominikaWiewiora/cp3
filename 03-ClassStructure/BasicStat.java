public class BasicStat {
    
    
    public static int countInRange(int x, int y) {
        return y - x + 1;  
    }

   
    public static int sumInRange(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

   
    public static double meanInRange(int x, int y) {
        int count = countInRange(x, y);
        int sum = sumInRange(x, y);
        return (double) sum / count;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

       
        int count = BasicStat.countInRange(x, y);
        int sum = BasicStat.sumInRange(x, y);
        double mean = BasicStat.meanInRange(x, y);

       
        System.out.println("Statistics for the range <" + x + ", " + y + ">:");
        System.out.println("Number of items: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Arithmetic Mean: " + mean);
    }
}
