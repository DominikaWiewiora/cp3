class Triangle extends Shape {

    private int podstawa, wysokość, side1, side2, side3;
    
        Triangle(int podstawa,int wysokość, int side1, int side2, int side3) {
            this.podstawa = podstawa;
            this.wysokość = wysokość;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    @Override
        double area() {
            return (podstawa*wysokość)/2;
        }

        @Override
        double perimeter() {
            return side1 + side2 + side3;
        }

    
}
