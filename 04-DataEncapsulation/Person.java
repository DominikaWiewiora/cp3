public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age>=18;
            
        }

    public String toString() {
        return name+", "+age;
    }
    
    
    public static void main(String[] args) {
    Person p = new Person("Anna", 21);   
    System.out.println(p.toString());
    System.err.println(p.isAdult());
    }
}
    
   

    

