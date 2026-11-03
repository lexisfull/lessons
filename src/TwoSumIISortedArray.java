public class TwoSumIISortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int reight = numbers.length - 1;
        while (left != reight) {
            if (numbers[left] + numbers[reight] > target) {
                reight--;
            } else if (numbers[left] + numbers[reight] < target) {
                left++;
            } else  {
                result[0] = left + 1;
                result[1] = reight + 1;
                return result;
            }
        }

        return result;
    }
}
