package Arrays.sorting;

import java.util.*;

public class mergeSort {

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for(int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }


    }

    public static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            merge_sort(arr, left, middle);
            merge_sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
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

    public static void main(String[] args) {
        int[] arr = new int[10];
        getInput(arr);

        merge_sort(arr, 0, arr.length - 1);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
