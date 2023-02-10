public class Feb10 {
    static int[] methAddArray(int[] a1, int... a2) {
        int[] res = new int[a1.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = a1[i] + a2[i];
        }

        return res;
    }

    public static void main(String[] args) {
        // int[] arr1 = new int[10];
        // int[] arr2;
        int[] arr3 = { 1, 2, 3, 4, 5, 6 };
        int[] arr4 = { 10, 11, 12, 13, 14, 15 };
        int[] arr5 = methAddArray(arr3, arr4);

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }

        // clone method is used to clone an array
    }
}