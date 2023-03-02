import java.util.ArrayList;

public class Feb24_1 {

    // ArrayList
    public static void main(String[] args) {

        // constructors
        // ArrayList()
        // default capacity is 10
        ArrayList list = new ArrayList();
        System.out.println(list.size()); // 0

        // adding elements
        // adding integer
        list.add(10);
        // adding string
        list.add("Java");
        // adding double
        list.add(1.2345);

        // adding at index i
        list.add(1, "Hello world");

        // display
        System.out.println(list);

        // size
        System.out.println(list.size());

        // ArrayList(int initialCapacity)
        ArrayList list2 = new ArrayList(20);
        System.out.println(list2.size()); // 0

        // addAll(Collection c)
        list2.addAll(list);

        // display
        System.out.println(list2);

        // size
        System.out.println(list2.size()); // 4

        // ArrayList(Collection c)
        ArrayList list3 = new ArrayList(list2);

        // addAll(Collection c)
        list3.addAll(2, list2);

        // display
        System.out.println(list3);
        // size
        System.out.println(list3.size()); // 8

        // clear()
        // removes all the elements

        // Object remove(int index)
        // removes the specified position in the list and returns it
        System.out.println("Before remove -->");
        System.out.println(list2);
        System.out.println("Removes item is: " + list2.remove(2));
        System.out.println("After remove -->");
        System.out.println(list2);

        // boolean remove(Object o)
        // removes the object present in the arrylist
        System.out.println("Before remove -->");
        System.out.println(list2);
        System.out.println("Removal status: " + list2.remove("Hello"));
        System.out.println("After remove -->");
        System.out.println(list2);

        // boolean contains(Object o)
        // returns true if the object is present in the list
        System.out.println("Contains status: " + list2.contains(10));

        // int indexOf(Object o)
        // returns the index of the first occurence of the object
        System.out.println("Index of 10: " + list2.indexOf(10));

        // int lastIndexOf(Object o)
        // returns the index of last occurence
        System.out.println("Last Index of 10: " + list2.lastIndexOf(10));

        // void ensureCapacity(int minCapacity)
        /// used to check whether the arraylist is empty or not

        // boolean isEmpty()
        // returns true if the list is empty
        System.out.println("Is empty: " + list2.isEmpty());

        // void trimToSize(int size)
        // used to trim the capacity of the arraylist

        // Object set(int index, Object element)
        // replaces the element at the specified position in the list with the specified
        // element
        // returns the element previously at the specified position

        // creating an object method
        Student s = new Student("ZB", 10);
        list.add(s);

        // display
        System.out.println(list);

        // using for each loop to print
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Student {
    String name;
    int rollNumber;

    // constructor
    Student(String n, int r) {
        this.name = n;
        this.rollNumber = r;
    }

    public String toString() {
        return this.name + " " + this.rollNumber;
    }
}