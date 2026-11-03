public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left] != nums[i]) {
                nums[left + 1] = nums[i];
                left++;
            }
        }
        return left + 1;
    }
}
