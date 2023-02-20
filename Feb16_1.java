import java.util.Arrays;

public class Feb16_1 {
    public static void main(String[] args) {
        String s1 = new String();
        s1 = "Hello";
        System.out.println(s1);
        System.out.println();

        String s2 = new String("Hello1");
        System.out.println(s2);
        System.out.println();

        char[] arr1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        String s3 = new String(arr1);
        System.out.println(s3);
        System.out.println();

        byte[] arr2 = { 65, 66, 67, 68, 69, 70, 71 };
        String s4 = new String(arr2);
        System.out.println(s4);
        System.out.println();

        String s5 = new String(arr2);
        System.out.println(s5);
        System.out.println();

        byte[] arr3 = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75 };
        String s6 = new String(arr3, 2, 3);
        System.out.println(s6);
        System.out.println();

        String s7 = new String(arr3, 5, 2);
        System.out.println(s7);

        int age = 10;
        String ageString = "He is " + age + " years old";
        System.out.println(ageString);

        System.out.println("Array1 length " + arr1.length);
        System.out.println("String length " + s1.length());

        String s8 = "Hello ";
        String s9 = "Java";
        System.out.println(s8 + s9);
        System.out.println(s8.concat(s9));

        // print value at index 0
        System.out.println(s8.charAt(0));
        System.out.println(s8.charAt(1));

        // toCharArray
        char arr4[] = s8.toCharArray();
        System.out.println(Arrays.toString(arr4));
        for (char c : arr4)
            System.out.print(c + " ");

        arr4 = "India".toCharArray();
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] >= 65 && arr4[i] <= 90)
                arr4[i] += 32;
            System.out.print(arr4[i]);
        }

        // convert all to uppercase
        String s10 = "hello";
        arr4 = s10.toCharArray();
        System.out.println();
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] >= 97 && arr4[i] <= 122)
                arr4[i] -= 32;
            System.out.print(arr4[i]);
        }
        System.out.println();

        // capital then small and so on
        arr4 = "This is a string".toCharArray();
        for (int i = 0; i < arr4.length; i++) {
            // if index is even
            if (i % 2 == 0) {
                // check if character is uppercase
                // if not then convert to uppercase
                if (arr4[i] >= 97 && arr4[i] <= 122)
                    arr4[i] -= 32;
            } else {
                if (arr4[i] >= 65 && arr4[i] <= 90)
                    arr4[i] += 32;
            }
            System.out.print(arr4[i]);
        }

        System.out.println();

        String temp = "welcome to programming in java";
        char[] x = new char[10];
        temp.getChars(0, 5, x, 3);
        System.out.println(Arrays.toString(x));

        temp = "KAMAL";
        x = new char[10];
        x[0] = 'N';
        x[1] = 'E';
        x[2] = 'E';
        x[3] = 'L';
        temp.getChars(0, 4, x, 4);
        System.out.println(Arrays.toString(x));
    }
}
