public class Mar9_1 {
    public static void main(String[] args) {
        TestInter ti1 = new TestInter();
        // System.out.println(ti1.sum(12, 17));
        // System.out.println(ti1.minus(12, 17));
        // System.out.println(ti1.multiply(1, 2));

        One o1 = new TestInter();
        System.out.println(o1.sum(12, 17));
        System.out.println(o1.minus(12, 17));
        // System.out.println(o1.multiply(1, 2));

        // Two o2 = new TestInter();
        // Two o2 = o1; // Type mismatch error

        // o2 will be able to access only the methods of Two
        Two o2 = ti1; // no Type mismatch
        // System.out.println(o2.sum(12, 17));
        // System.out.println(o2.minus(12, 17));
        System.out.println(o2.multiply(1, 2));
    }
}

interface One {
    int sum(int a, int b);

    int minus(int a, int b);
}

interface Two {
    int multiply(int a, int b);

    int sum(int a, int b);
}

// multiple inheritance
class TestInter implements One, Two {
    // method overriding
    // remove the ambiguity by defining the method only one time
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