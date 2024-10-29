public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (4,5) is ");
        System.out.println(SurfaceArea.rectangle(4,5));
        System.out.println(SurfaceArea.circle(3));
        System.out.println(SurfaceArea.triangle(3, 4));
        System.out.println(SurfaceArea.cuboid(5, 6.7f, 10));
        System.out.println(SurfaceArea.sphere(5));
        System.out.println(SurfaceArea.cone(3.6f, 5.8f));
    }
}
