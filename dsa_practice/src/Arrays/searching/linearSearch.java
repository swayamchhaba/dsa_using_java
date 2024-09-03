package Arrays;

public class linearSearch {
    public static void main (String[] args) {

        /*
        we start off by declaring the first array
        then we have to traverse the array to find the required solution
        comparing each value of the array till we reach the required value
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int location = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                location = i+1;
                break;
            }
        }

        if (location == -1) {
            System.out.println("Element not present in the given array");
        } else {
            System.out.println("Element found at location " + location);
        }

    }
}
