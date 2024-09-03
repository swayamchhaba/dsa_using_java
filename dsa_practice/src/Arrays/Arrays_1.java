package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1 {

    public static void main (String[] args) {

//      Scanner object initialization
        Scanner sc = new Scanner(System.in);

//      initializing the array by using various methods
        int[] arr = new int[5]; // default values are 0;
        int[] arr_2 = {1, 2, 3, 4, 5};

        Arrays.sort(arr_2);

        for (int i : arr_2) {
            System.out.println(i);
        }

//      this is a 2d array
        int[][] array_2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }

//      taking input for the array from the user
        int[] user_input = new int[5];
        for (int i = 0; i < user_input.length; i++) {
            System.out.println("Enter the data for array");
            user_input[i] = sc.nextInt();
        }
//      printing user entered data
        for (int data : user_input) {
            System.out.print(data + " ");
        }
        System.out.println();

//      printing the given array in reverse order
        for (int i = user_input.length - 1; i >= 0; i--) {
            System.out.print(user_input[i] + " ");
        }

    }
}
