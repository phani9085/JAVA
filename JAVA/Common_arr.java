public class Common_arr {
    public static void main(String[] args) {
        int[] arr = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
        int[] arr1 = new int[] { 39, 50, 47, 58, 29, 12, 17 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
