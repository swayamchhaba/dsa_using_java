package Arrays.sorting;

import java.util.Scanner;

public class insetionSort {

    public static void getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
    }

    public static void insertion_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        getInput(arr);
        insertion_sort(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
