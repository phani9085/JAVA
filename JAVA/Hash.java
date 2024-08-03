import java.util.*;

public class Hash {
    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 4, 2, 3, 1, 5, 3, 4, 2, 3, 1, 2 };
        HashMap<Integer, Integer> cb = new HashMap<>();
        for (int i : array) {
            if (cb.containsKey(i)) {
                cb.put(i, cb.get(i) + 1);
            } else {
                cb.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : cb.entrySet()) {
            System.out.println(entry.getKey() + "occurs" + entry.getValue() + "times");
        }
    }
}
