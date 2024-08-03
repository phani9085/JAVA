public class Max_arr {
    public static void main(String[] args) {
        int[] arr = new int[] { 20, 40, 30, 60, 18 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max element in the array: " + max);
    }
}