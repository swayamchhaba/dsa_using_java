package Arrays.sorting;

import java.util.*;

public class selectionSort {

    public static void getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
    }

    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main (String[] args) {
        int[] arr = new int[10];

        getInput(arr);

        // we take the largest element and move it to the end
        selection_sort(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
