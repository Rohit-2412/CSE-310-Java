public class Feb20_2 {
    // StringBuilder class
    public static void main(String[] args) {
        // default size is 16
        // if nothing is passed in the constructor
        StringBuilder sb = new StringBuilder();
        System.out.println("sb1: " + sb.length()); // 0
        System.out.println("sb1: " + sb.capacity()); // 16

        // if a number is passed in the constructor
        // then that is the capacity
        StringBuilder sb2 = new StringBuilder(25);
        System.out.println("sb2: " + sb2.length()); // 0
        System.out.println("sb2: " + sb2.capacity()); // 25

        // if a string is passed in the constructor
        // then the capacity is the length of the string + 16
        StringBuilder sb3 = new StringBuilder("string builder example");
        System.out.println("sb3: " + sb3.length()); // 22
        System.out.println("sb3: " + sb3.capacity()); // 22 + 16 = 38

        // formula for memory reallocation
        // newCapacity = (oldCapacity * 2) + 2

        // setLength()
        // set the length of the string by passing in an int
        // this will truncate the string if the int is less than the length
        // or it will add spaces if the int is greater than the length

        // charAt()
        // returns the character at the specified index

        // setCharAt()
        // sets the character at the specified index

        // example
        sb3.setCharAt(0, 'I');
        System.out.println("sb3: " + sb3);

        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        // copies characters from this string into the destination character array

        // append(String s)
        // appends the string to the end of the string builder
        // returns a reference to the new string builder

        // example
        sb3.setCharAt(0, 'S');
        sb3.append(" is a string builder");
        System.out.println("sb3: " + sb3);
        // adding int to a string builder
        sb3.append(123);
        System.out.println("sb3: " + sb3);

        // insert(int offset, String s)
        // inserts the string at the specified offset
        // example
        sb3.insert(0, "ABCBA");
        System.out.println("sb3: " + sb3);

        // reverse()
        // reverses the string
        // example
        sb3.reverse();
        System.out.println("sb3: " + sb3);
        sb3.reverse();

        // delete()
        // deletes the characters from the specified start to the specified end
        // example
        sb3.delete(0, 5);
        System.out.println("sb3: " + sb3);

        // deleteCharAt()
        // deletes the character at the specified index
        // example
        sb3.deleteCharAt(0);
        System.out.println("sb3: " + sb3);

        // replace()
        // replaces the characters from the specified start to the specified end
        // with the specified string
        // example
        sb3.replace(0, 5, "ABCDE");
        System.out.println("sb3: " + sb3);

        // substring()
        // returns a new string that is a substring of this string
        // example
        String s = sb3.substring(0, 5);
        System.out.println("s: " + s);
    }
}
