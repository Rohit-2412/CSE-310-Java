
public class Feb_17_3 {
    public static void main(String[] args) {
        String s1 = "India";
        boolean b1 = s1.equals("india");
        System.out.println(b1);
        System.out.println(s1.equals("india"));

        String s2 = "INDIA";
        boolean b2 = s2.equalsIgnoreCase("india");
        System.out.println(b2);

        System.out.println(s1.startsWith("Ind"));
        System.out.println(s1.startsWith("ind"));

        System.out.println(s2.endsWith("ia"));
        System.out.println(s2.endsWith("IA"));

        if ("India".compareTo("Australia") > 0)
            System.out.println("Bigger");
        else
            System.out.println("Smaller");

        // capital letters comes first in the dictionary
        if ("A".compareTo("a") > 0) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
    }
}
