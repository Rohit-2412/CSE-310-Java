public class Mar9_2 {
    public static void main(String[] args) {
        TestInter ti1 = new TestInter();
        System.out.println(ti1.sum(12, 17));
        System.out.println(ti1.minus(12, 17));
        System.out.println(ti1.multiply(1, 2));

        Two t2 = new TestInter();
        // no error
        System.out.println(t2.sum(12, 17));
        System.out.println(t2.minus(12, 17));
        System.out.println(t2.multiply(1, 2));
    }
}

interface One {
    int sum(int a, int b);

    int minus(int a, int b);
}

// interfaces can also be extended
interface Two extends One {
    int multiply(int a, int b);
}

// multiple inheritance
class TestInter implements Two {
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