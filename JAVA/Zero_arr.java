public class Zero_arr {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 0, 2, 0, 5, 4, 0 };
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c++] = arr[i];
            }
        }
        while (c < arr.length) {
            arr[c++] = 0;
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}