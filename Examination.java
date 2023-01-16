import java.util.Scanner;

public class Examination {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        String name = scanner.next();

        System.out.print("Enter the registration number of student: ");
        long reg = scanner.nextLong();

        show(name, reg);
        scanner.close();
    }

    static void show(String name, long reg_num) {
        System.out.println("Name of Student is: " + name);
        System.out.println("Reg. Number of student is: " + reg_num);
    }
}
