import java.util.*;

class Sum_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 4, 5, 6, 7 };
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

}