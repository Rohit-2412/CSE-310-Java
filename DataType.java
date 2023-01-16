public class DataType {
    public static void main(String[] args) {
        // PRIMITIVE DATA TYPES //
        // byte data type
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println("c(byte) = " + c);

        // cyclic nature
        byte d = (byte) 128;
        // value of d is neg sign (128 - 256)
        System.out.println("d(byte) = " + d);

        // short data type
        short s = 100;
        short t = 200;
        short u = (short) (s + t);
        System.out.println("u(short) = " + u);
        // cyclic nature
        short v = (short) 32768;
        // value of v is neg sign (32768 - 65536)
        System.out.println("v(short) = " + v);

        // int data type
        int i = 1000;
        int j = 2000;
        int k = i + j;
        System.out.println("k(int) = " + k);

        // long data type
        long l = 1000000000000L;
        long m = 2000000000000L;
        long n = l + m;
        System.out.println("n(long) = " + n);

        // float data type
        /*
         * error because we have to add f at the end of the value to
         * make it float
         */
        // float f = 10.5;
        float f = 10.5f;
        float g = 20.5f;
        float h = f + g;
        System.out.println("h(float) = " + h);
        // rounding off property
        float i1 = 9.999999f;
        System.out.println("i1(float) = " + i1);
        // number of digits in decimal
        // it will show 9.1234567
        float fl1 = 9.123456789f;
        System.out.println("fl1(float) = " + fl1);

        // double data type
        double d1 = 10.5;
        double d2 = 20.5;
        double d3 = d1 + d2;
        System.out.println("d3(double) = " + d3);

        // char data type
        char ch1 = 'A';
        char ch2 = 65;
        System.out.println("ch1(char) = " + ch1);
        System.out.println("ch2(char) = " + ch2);

        // boolean data type
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = bool1 && bool2;
        boolean bool4 = bool1 || bool2;
        System.out.println("bool3(boolean) = " + bool3);
        System.out.println("bool4(boolean) = " + bool4);

    }
}
