package Arrays.sorting;

import java.util.*;

public class quickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return(i + 1);
    }

    public static void  quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quick_sort(arr, low, p - 1);
            quick_sort(arr, p + 1, high);
        }
    }

    public static void getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
    }

    public static void main (String[] args) {
        int[] arr = new int[10];

        getInput(arr);
        quick_sort(arr, 0, arr.length - 1);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
