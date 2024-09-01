package Arrays;

import java.util.Arrays;

public class Arrays_1 {

    public static void main (String[] args) {

//      initializing the array by using various methods
        int[] arr = new int[5]; // default values are 0;
        int[] arr_2 = {1, 2, 3, 4, 5};

        Arrays.sort(arr_2);

        for (int i : arr_2) {
            System.out.println(i);
        }
    }
}
