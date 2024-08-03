import java.util.*;

class Insertion_Sort {
    void insertionSort(int arr[]) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String args[]) {
        int[] data = { 40, 20, 60, 50, 10, 70 };
        Insertion_Sort is = new Insertion_Sort();
        is.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}