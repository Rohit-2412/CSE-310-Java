public class Mar9_4 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 17);
        System.out.println("Area: " + r1.computeArea());
        System.out.println("Perimeter: " + r1.computePerimeter());

        Square s1 = new Square(12);
        System.out.println("Area: " + s1.computeArea());
        System.out.println("Perimeter: " + s1.computePerimeter());

        Triangle t1 = new Triangle(12, 17);
        System.out.println("Area: " + t1.computeArea());
        System.out.println("Perimeter: " + t1.computePerimeter());
    }
}

interface Figure {
    double computeArea();

    double computePerimeter();
}

class Rectangle implements Figure {
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

class Square implements Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double computeArea() {
        return side * side;
    }

    public double computePerimeter() {
        return 4 * side;
    }
}

class Triangle implements Figure {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }

    public double computePerimeter() {
        return 3 * base;
    }
}