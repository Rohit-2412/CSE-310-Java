import java.util.Scanner;

public class Feb_20_1 {
    /*
     * write a function to count the number of characters in a string using this
     * function
     * static int countChars(String s, char c)
     * {
     * // code //
     * }
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        System.out.print("Enter character to search: ");
        char c = s.next().charAt(0);
        System.out.println("Number of " + c + " in `" + str + "` is " + countChars(str, c));
        System.out.println("Number of " + c + " in `" + str + "` is " + countChars2(str, c));
        System.out.println("Number of " + c + " in `" + str + "` is " + countChars3(str, c));

        s.close();

    }

    // using charAt()
    static int countChars(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // using indexOf()
    static int countChars2(String s, char c) {
        int count = 0;
        int index = s.indexOf(c);
        while (index != -1) {
            count++;
            index = s.indexOf(c, index + 1);
        }
        return count;
    }

    // using lastIndexOf()
    static int countChars3(String s, char c) {
        int count = 0;
        int index = s.lastIndexOf(c);
        while (index != -1) {
            count++;
            index = s.lastIndexOf(c, index - 1);
        }
        return count;
    }
}
