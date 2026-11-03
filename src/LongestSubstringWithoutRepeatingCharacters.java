import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int maxSize = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            while (chars.contains(s.charAt(i)) && left < i) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(i));
            if (chars.size() > maxSize) {
                maxSize = chars.size();
            }
        }
        return maxSize;
    }
}
