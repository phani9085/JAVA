import java.util.*;

class Min_max_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 30, 14, 5, 16, 27 };
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}