public class Feb17_4 {
    public static void main(String[] args) {
        String s = "India";
        System.out.println("i: " + s.indexOf("i"));
        System.out.println("I: " + s.indexOf("I"));
        System.out.println("In: " + s.indexOf("In"));
        System.out.println("a: " + s.indexOf("a"));
        System.out.println("ABC: " + s.indexOf("ABC"));
        System.out.println("Welcome to programmig in Java".indexOf('m'));
        System.out.println("Welcome to programmig in Java".indexOf("pro"));

        System.out.println("Welcome to programmig in Java".indexOf('m', 7));
        System.out.println("Welcome to programmig in Java".indexOf("pro", 10));

        System.out.println("Welcome to programmig in Java".lastIndexOf('m', 7));
        System.out.println("Welcome to programmig in Java".lastIndexOf("pro", 10));

        System.out.println("Welcome to programmig in Java".lastIndexOf('m'));
        System.out.println("Welcome to programmig in Java".lastIndexOf("pro"));

        s = "Now is the time for all good men " +
                "to come to the aid of their country.";
        System.out.println(s);
        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        System.out.println("indexOf(the) = " + s.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
        System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));

    }
}
