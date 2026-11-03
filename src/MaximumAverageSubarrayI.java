public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += nums[i];
        }
        int max = result;
        for (int i = k; i < nums.length; i++) {
            result -= nums[i - k];
            result += nums[i];
            if (result > max) {
                max = result;
            }
        }
        return (double) max / k;
    }
}
