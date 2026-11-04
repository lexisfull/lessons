import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) {
            return res;
        }
        int left = 0;
        int reight = p.length() - 1;
        int[] freq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a'] ++;
        }
        int[] freq2 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq2[s.charAt(i) - 'a'] ++;
        }
        while (reight < s.length()) {
            if (Arrays.equals(freq, freq2)) {
                res.add(left);
            }
            if (reight + 1 == s.length()) {
                return res;
            }
            freq2[s.charAt(left) - 'a']--;
            freq2[s.charAt(reight + 1) - 'a']++;

            left++;
            reight++;
        }
        return res;
    }

}
