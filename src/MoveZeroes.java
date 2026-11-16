public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] == 0 && nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;

            }
            while (left < i && nums[left] != 0) {
                left++;
            }
        }
    }
}
