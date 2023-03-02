import java.util.ArrayList;

public class Feb24_2 {
    // ArrayList of specific type
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Java");
        a1.add("Python");
        a1.add("C++");
        a1.add("C#");
        a1.add("JavaScript");
        a1.add("PHP");
        a1.add("Ruby");
        a1.add("Go");
        a1.add("Swift");
        a1.add("Kotlin");
        a1.add("Rust");
        a1.add("Dart");
        a1.add("Scala");
        a1.add("Perl");
        a1.add("Groovy");

        // a1.add(100); // error
        System.out.println(a1);

        // display using for each loop
        for (String s : a1) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (Object o : a1) {
            System.out.print(o + " ");
        }

        System.out.println();

        // size()
        System.out.println("Size: " + a1.size());

        // get(int index)
        System.out.println("Element at index 3: " + a1.get(3));

        // set(int index, E element)
        a1.set(3, "C");

        // display
        System.out.println(a1);

        // remove(int index)
        a1.remove(3);

        // display
        System.out.println(a1);

        // remove(Object o)
        a1.remove("C");

        // display
        System.out.println(a1);

        // indexOf(Object o)
        System.out.println("Index of Java: " + a1.indexOf("Java"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Java: " + a1.lastIndexOf("Java"));

        // contains(Object o)
        System.out.println("Contains Java: " + a1.contains("Java"));

        // isEmpty()
        System.out.println("Is empty: " + a1.isEmpty());

        // trimToSize()
        a1.trimToSize();
        System.out.println("Trimmed size: " + a1.size());

        // clear()
        a1.clear();

        // display
        System.out.println(a1);

    }
}
