import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < nums1.length; i ++) {
            nums.add(nums1[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i ++) {
            if (nums.remove(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] arrayResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }
        return arrayResult;
    }
}
