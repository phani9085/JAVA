import java.util.*;

public class Common_arr_other {
    public static void main(String[] args) {
        int[] arr = new int[] { 90, 23, 5, 109, 90, 22, 67, 34 };
        Set<Integer> ce = new HashSet<>();
        boolean cd = false;
        for (int num : arr) {
            if (!ce.add(num)) {
                cd = true;
                break;
            }
        }
        System.out.println(cd);
    }
}