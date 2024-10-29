public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static float circle(float radius) {
        return (float) Math.PI*radius*radius;
    }

    static float triangle(float base, float height) {
        return (base*height)/2;
    }

    static float cuboid(float length, float width, float height) {
        return 2*(length*width)+2*(length*height)+2*(height*width);

        //2lw+2lh+2hw
    }
        //Surface Area of Sphere = 4πr²  cone = πr(r + l)
    static float sphere(float radius) {
        return  4*(float)(Math.PI)*(radius*radius);
    }
    
    static float cone(float radius, float length) {
        return (float)(Math.PI)*radius*(radius+length);
    }
}
