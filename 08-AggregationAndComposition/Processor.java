public class Processor {
    private String type;
    private int coreCount;
    private double speed;
    private double performance;

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    

    public Processor(String type, int coreCount, double speed) {
        this.type = type;
        this.coreCount = coreCount;
        this.speed = speed;
    }

    public double calculatePerformence() {
        double performance = coreCount*speed*10;
        return performance;

    }
    public double getPerformance() {
            return performance;
        }
    public String toString() {
        return "Type: "+type+" Core-count: "+coreCount+" Speed: "+speed+" Performance: "+performance;

    }
}
