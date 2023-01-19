public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("Hello" + 10 + 20); // Hello1020
        System.out.println(10 + 20 + "Hello"); // 30Hello
        System.out.println("Hello" + (10 + 20)); // Hello30
        System.out.println('a' + 'a' + "Hello"); // 194Hello {ascii of 'a' is 97}
        System.out.println("Hello" + 'a' + 'a'); // Helloaa
        System.out.println(5.5 + 5.5 + "Hello"); // 11.0Hello
        System.out.println("Hello" + 5.5 + 5.5); // Hello5.55.5
    }
}
