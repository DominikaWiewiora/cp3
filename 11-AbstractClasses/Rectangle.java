class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    } 

   
    @Override
    double perimeter() {
        return 2 * (width + height);
    }

}