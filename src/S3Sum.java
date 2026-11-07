import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int i = 0;
        int left = i + 1;
        int reight = nums.length - 1;
        while (i < nums.length) {
            while (left < reight) {
                if (nums[i] + nums[left] + nums[reight] == 0) {
                    res.add(List.of(nums[i], nums[left], nums[reight]));
                    left++;
                    reight--;
                } else if (nums[i] + nums[left] + nums[reight] > 0) {
                    reight--;
                }else if (nums[i] + nums[left] + nums[reight] < 0) {
                    left ++;
                }
            }
            i++;
            left = i + 1;
            reight = nums.length - 1;
        }
        return new ArrayList<>(res);
    }

    /** Тоже рабочее но медленное */
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        Set<List<Integer>> res = new HashSet<>();
//        int i = 0;
//        int left = i + 1;
//        int reight = nums.length - 1;
//        while (i < nums.length) {
//            while (left < reight) {
//                if (nums[i] + nums[left] + nums[reight] == 0) {
//                   res.add(List.of(nums[i], nums[left], nums[reight]));
//                   left++;
//                   reight--;
//                } else if (nums[i] + nums[left] + nums[reight] > 0) {
//                    reight--;
//                }else if (nums[i] + nums[left] + nums[reight] < 0) {
//                    left ++;
//                }
//            }
//            i++;
//            left = i + 1;
//            reight = nums.length - 1;
//        }
//        return new ArrayList<>(res);
//    }
/** Тоже рабочее но медленное */
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        Set<Integer> targets = new HashSet<>();
//        Set<List<Integer>> res = new HashSet<>();
//        List<Integer> ints = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            int current = nums[i];
//            int reight = i + 1;
//            targets.add(nums[reight]);
//            reight++;
//            while (reight < nums.length) {
//                int sum =  - (current + nums[reight]);
//                if (targets.contains(sum)) {
//                    ints.add(sum);
//                    ints.add(current);
//                    ints.add(nums[reight]);
//                }
//                targets.add(nums[reight]);
//                reight++;
//                if (ints.size() ==3) {
//                    res.add(new ArrayList<>(ints));
//                    ints.clear();
//                }
//            }
//            targets.clear();
//        }
//        return new ArrayList<>(res);
//    }
}
