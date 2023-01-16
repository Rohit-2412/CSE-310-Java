import java.util.Scanner;

public class InputDemo {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter a boolean value: ");
        boolean b = sc.nextBoolean();

        System.out.println("---Entered values---");
        System.out.println("Line: " + line);
        System.out.println("Word: " + word);
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + b);

        sc.close();
    }
}