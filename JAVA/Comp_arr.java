import java.util.Arrays;

public class Comp_arr {
    public static void main(String[] args) {
        int[] arr = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
        Arrays.sort(arr);
        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}