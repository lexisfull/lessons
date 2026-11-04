public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int reight = height.length - 1;
        int left = 0;
        int res = 0;
        int length = height.length - 1;
        while (left < reight) {
            int min = Math.min(height[left], height[reight]);
            if (res < min * length) {
                res = min * length;
            }
            if (height[left] < height[reight]) {
                left++;
            } else {
                reight--;
            }
            length--;
        }
        return res;
    }
}
