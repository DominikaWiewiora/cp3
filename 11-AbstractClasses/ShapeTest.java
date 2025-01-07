public class ShapeTest {
    public static void main(String[] args) {
        // Create objects of geometric figures
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(4, 7, 3, 3, 4);
        Shape circle = new Circle(3);

        // Display the areas
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}