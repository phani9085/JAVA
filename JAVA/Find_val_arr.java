public class Find_val_arr {
    public static void main(String[] args) {
        int[] arr = new int[] { 20, 40, 30, 60, 18 };
        int k = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                System.out.println(i);
        }
    }
}