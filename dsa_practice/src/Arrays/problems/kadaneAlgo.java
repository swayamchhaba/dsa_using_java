package Arrays.problems;

public class kadaneAlgo {
    public static int maxSubArray(int[] nums) {
        int max_till_here = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < nums.length; i++) {
            max_ending_here += nums[i];

            if (max_ending_here > max_till_here) {
                max_till_here = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        return max_till_here;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print("Max sub array is " + maxSubArray(arr));
    }

}
