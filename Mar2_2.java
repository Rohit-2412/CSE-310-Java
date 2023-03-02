public class Mar2_2 {

}

class Box {
    double height;
    double width;
    double depth;

    // default constructor
    Box() {
        height = 0;
        width = 0;
        depth = 0;
    }

    // parameterized constructor
    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // method to display details
    void showDetails() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }
}

class BoxWeight extends Box {
    double weight;

    // default constructor
    BoxWeight() {
        super();
        weight = 0;
    }

    // parameterized constructor
    BoxWeight(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    // method to display weight
    void showWeight() {
        System.out.println("Weight: " + weight);
    }

    // method to display details
    void showDetails() {
        super.showDetails();
        showWeight();
    }
}

class BoxColor extends BoxWeight {
    String color;

    // default constructor
    BoxColor() {
        super();
        color = "no color";
    }

    // parameterized constructor
    BoxColor(double height, double width, double depth, double weight, String color) {
        super(height, width, depth, weight);
        this.color = color;
    }

    // method to display color
    void showColor() {
        System.out.println("Color: " + color);
    }
}