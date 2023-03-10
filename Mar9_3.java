public class Mar9_3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 17);
        System.out.println("Area: " + r1.computeArea());
        System.out.println("Perimeter: " + r1.computePerimeter());
    }
}

interface Shape {
    double computeArea();

}

// extend the Shape to interface GeometricShape
interface GeometricShape extends Shape {
    double computePerimeter();
}

// and add methods
// create a class Rectangle that implements the interfaces and overrides the
// interface
class Rectangle implements GeometricShape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double computeArea() {
        return length * breadth;
    }

    public double computePerimeter() {
        return 2 * (length + breadth);
    }
}
