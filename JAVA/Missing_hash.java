import java.util.*;

public class Missing_hash {
    public static void main(String args[]) {
        int[] arr = { 2, 5, 1, 7, 4, 8, 3, 9 };
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int missingnumber = -1;
        for (int i = 1; i < max; i++) {
            if (!set.contains(i)) {
                missingnumber = i;
                break;
            }
        }
        if (missingnumber == -1) {
            System.out.println("no missing numbers");
        } else {
            System.out.println("missing numbers" + missingnumber);
        }
    }
}
