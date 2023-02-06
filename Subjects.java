import java.util.Scanner;

public class Subjects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        System.out.print("How many subjects? ");
        size = s.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }
        System.out.println("\nDisplaying Marks for all subjects");
        for (int i = 0; i < size; i++) {
            System.out.println("Marks for subject " + (i + 1) + " is " + marks[i]);
        }

        s.close();

    }
}
