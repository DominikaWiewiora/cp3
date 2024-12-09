public class Computer {
    private Processor processor;
    private String brand;
    private String storageSize;


    public Computer(String processorType,int coreCount, double speed, String brand, String storageSize) {
        this.processor = new Processor(processorType, coreCount, speed);
        this.brand = brand;
        this.storageSize = storageSize;
    }



    public Processor getProcessor() {
        return processor;
    }



    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getStorageSize() {
        return storageSize;
    }



    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }



    public String toString() {
        return "Computer with processor: "+processor+" Brand: "+brand+ " Storage size: "+storageSize;
    }


}