public class Selection_sort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String a[]) {
        int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
        selectionSort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}