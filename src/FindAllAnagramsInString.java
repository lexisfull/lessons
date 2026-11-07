import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();
        if (p.length() > s.length() || p.isEmpty() || s.isEmpty()) {
            return indexes;
        }
        int[] target = new int[26];
        for (int i = 0; i < p.length(); i++) {
            target[p.charAt(i) - 'a']++;
        }
        int[] source = new int[26];
        int left = 0;
        int reight = p.length() - 1;
        for (int i = left; i <= reight; i++) {
            source[s.charAt(i) - 'a']++;
        }
        while (reight < s.length()) {
            if (Arrays.equals(target, source)) {
                indexes.add(left);
            }
            if (reight == s.length() - 1) {
                break;
            }
            source[s.charAt(left) - 'a']--;
            source[s.charAt(reight + 1) - 'a']++;
            left++;
            reight++;
        }
        return indexes;
    }
}
