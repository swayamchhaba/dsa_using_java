package Arrays.problems;

import java.util.*;

public class rotationOfArray {

    static void rotation(int[] arr, int k) {
        if (k == 0) {
            return;
        }

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        rotation(arr, k - 1);
    }

    static void getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
    }

    static void printArray (int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        getInput(arr);

        System.out.print("Enter the elements k to be rotated ");
        int k = sc.nextInt();

        rotation(arr, k);
        printArray(arr);
    }
}
