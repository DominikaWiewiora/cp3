public class PersonsRecord9 {
    private String name;
    private double weight;
    private double height;

    public PersonsRecord9(String name) {
        this.name = name;
    }

    public PersonsRecord9(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height; 
    }

    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight/((height/100)*(height/100));
        
    }

    @Override 

    public String toString() {
        double BMI = calculateBMI();
        if (BMI < 18.5) {
            return "Name: " + name +
                   "\nWeight: "+weight+
                   "\nHeight: "+height+
                   "\nBMI: "+BMI+
                   " BMI too low";
        }
        else if (BMI > 24.9) {
            return "Name: " + name +
                   "\nWeight: "+weight+
                   "\nHeight: "+height+
                   "\nBMI: "+BMI+
                   " BMI too high";
        }

        else {
            return "Name: " + name +
                   "\nWeight: "+weight+
                   "\nHeight: "+height+
                   "\nBMI: "+BMI;
                   
        }
    }


    public static void main(String[] args) {
        PersonsRecord9 person1 = new PersonsRecord9("Anna", 20, 160);
        System.err.println(person1);
    }

}
