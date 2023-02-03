public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();
        System.out.println("Volume of Box b1 is: " + b1.getVolume());

        Box b2 = new Box(10.5);
        b2.display();
        System.out.println("Volume of Box b2 is: " + b2.getVolume());

        Box b3 = new Box(10.2, 10.1, 5.4);
        b3.display();
        System.out.println("Volume of Box b3 is: " + b3.getVolume());

        Box b4 = new Box(b3);
        b4.display();
        System.out.println("Volume of Box b4 is : " + b4.getVolume());

        Box b5 = b3.getBox();

        b5.display();
        b3.display();

        System.out.println("Updating height of b3 by +100");
        b3.height += 100;
        System.out.println("B5 height is: " + b5.height);

        System.out.println("Updating length of b5 by +10");
        System.out.println("B3 length is: " + b3.length);
        System.out.println();

        b3.display();
        b5.setBox(b3);
        b5.display();
    }

}

/*
 * WAP to create class box having
 * attributes: width, height, length --double
 * default constructor
 * add parameterized constructor accepting single value for all members
 * add parameterized constructor accepting 3 separate values for each member
 * method to return the volume of the box
 * method to display values
 */

class Box {
    // data members
    double width;
    double height;
    double length;

    // default constructor
    Box() {
    }

    // parameterized constructor
    Box(double val) {
        this.width = val;
        this.height = val;
        this.length = val;
    }

    // parameterized constructor
    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(Box b) {
        this.width = b.width + 5;
        this.height = b.height + 5;
        this.length = b.length + 5;
    }

    // getter method
    Box getBox() {
        return this;
    }

    // setter method
    void setBox(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.length = b.length;
    }

    // method to return the volume of the box
    public double getVolume() {
        return this.width * this.height * this.length;
    }

    // method to display values
    public void display() {
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Length: " + this.length);
        System.out.println();
    }

}
