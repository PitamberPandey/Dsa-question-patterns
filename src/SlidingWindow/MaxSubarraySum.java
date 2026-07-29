package SlidingWindow;

public class MaxSubarraySum {

    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int k = 2;

        int result = maxSubarraySums(arr, k);
        System.out.println("Maximum Subarray Sum: " + result);
    }

    public static int maxSubarraySums(int[] arr, int k) {

        if (arr == null || arr.length < k || k <= 0) {
            return -1;
        }

        // First window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int result = sum;


        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k];
            sum = sum + arr[i];

            result = Math.max(result, sum);
        }

        return result;
    }
}