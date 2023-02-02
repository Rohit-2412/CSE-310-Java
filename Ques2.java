import java.util.Scanner;

public class Ques2 {
    /*
     * wap to create a class examination having a method calculate TGPA
     * ask the student to enter the marks in 3 subjects
     * calculate the TGPA of the student return the calculated TGPA of the student
     * call this method in main for the final output
     */
    public static void main(String[] args) {
        // creating object
        Examination stu1 = new Examination();
        System.out.println("TGPA: " + stu1.calculateTGPA());
    }

    static class Examination {
        // method
        double calculateTGPA() {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter marks in subject 1: ");
            int sub1 = s.nextInt();
            System.out.print("Enter marks in subject 2: ");
            int sub2 = s.nextInt();
            System.out.print("Enter marks in subject 3: ");
            int sub3 = s.nextInt();
            double tgpa = (sub1 + sub2 + sub3) / 3;
            s.close();
            return tgpa;

        }
    }
}
