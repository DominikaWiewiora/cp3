public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        s.name = "John";
        s.age = 23;
        System.out.println("Name: "+ s.name);
        System.out.println("Age: "+s.age);


        Student s1 = new Student();
        s1.name = "Kasia";
        s1.age = 22;
        s1.sayHello();
        s1.displayName();
        s1.displayAge();

        Student s2 = new Student();
        s2.name = "Ola";
        s2.age = 24;
        s2.sayHello();
        s2.displayName();
        s2.displayAge();


    }
}
