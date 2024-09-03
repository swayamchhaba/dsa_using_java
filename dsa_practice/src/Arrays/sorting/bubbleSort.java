package Arrays.sorting;

import java.util.*;

public class bubbleSort {

    public static int[] getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        return arr;
    }

    public static int[] bubble_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        getInput(arr);

        bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
