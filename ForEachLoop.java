public class ForEachLoop {
    public static void main(String[] args) {
        int[] num = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : num) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum is " + sum);
    }
}
