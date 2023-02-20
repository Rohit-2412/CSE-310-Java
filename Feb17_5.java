public class Feb17_5 {
    public static void main(String[] args) {
        String s = "Welcome to programming in java";
        // return a new substring
        // original is not modified
        System.out.println(s.substring(2));
        System.out.println(s.substring(1, 4));

        // replace method
        // original is not modified
        String res = s.replace("programming", "coding");
        System.out.println(res);
        res = s.replace("e", "E");
        System.out.println(res);

        System.out.println();
        System.out.println(s);

        // trim method

        s = "Hello        ";
        System.out.println("s.length(): " + s.length());
        System.out.println("s.trim().length(): " + s.trim().length());
        System.out.println();
        s = "        abc     ";
        System.out.println("s.length(): " + s.length());
        System.out.println("s.trim().length(): " + s.trim().length());
    }
}
