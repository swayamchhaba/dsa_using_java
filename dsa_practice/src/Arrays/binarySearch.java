package Arrays;

public class binarySearch {

    private static int binarySearchAlgo(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;

        System.out.println("Element found at " + (binarySearchAlgo(arr, target) + 1) + " position.");
    }
}
