// not allowed in java
// class A extends B,C { }

// Interface
// object can not be created for the interface
interface If1 {
    int ABC = 10; // by default public static final
    double PI = 3.14;

    // by default it is abstract
    // method declaration
    int sum(int a, int b);

    int minus(int a, int b);
    // no concrete methods can be declared

    // default implementation
    default int multiply(int a, int b) {
        return -1;
    }

    // static method
    // cannot be overridden
    static void display() {
        System.out.println("Working on Interfaces in Java");
    }
}

// either implement all incomplete methods or make the class abstract
class TestIf1 implements If1 {

    // adding a new method
    void testMethodClass() {
        System.out.println("testMethodClass()");
    }

    // method overriding
    public int sum(int a, int b) {
        return a + b;
    }

    // method overriding
    public int minus(int a, int b) {
        return a - b;
    }

    // method overriding
    public int multiply(int a, int b) {
        return a * b;
    }

}

public class Mar6_1 {
    public static void main(String[] args) {
        TestIf1 objIf1 = new TestIf1();
        objIf1.testMethodClass(); // no error
        System.out.println(objIf1.sum(12, 17));
        System.out.println(objIf1.minus(12, 17));
        System.out.println(objIf1.multiply(1, 2));
        // calling static method
        If1.display();

        // creating reference variable of type Interface <If1>
        If1 objIf2 = new TestIf1();
        System.out.println(objIf2.sum(12, 17));
        System.out.println(objIf2.minus(12, 17));
        System.out.println(objIf2.multiply(1, 2));
    }
}