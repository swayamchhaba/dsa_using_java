package Arrays.problems;

import java.util.*;

public class rotationOfArray {

    static void rotation(int[] arr, int k) {

    }

    static void getInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        getInput(arr);

        System.out.print("Enter the elements k to be rotated ");
        int k = sc.nextInt();

        rotation(arr, k);
    }
}
