public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int centre = s.length() / 2;
        int left = centre;
        int reight = centre;
        if (centre == 0) {
            reight = centre + 1;
        }

        int start = 0;
        int end = 0;
        int size = 0;
        int[] res = palindromeSize(reight, left, size, start, end, s);
        start = res[1];
        end = res[2];
        size = res[0];
        int[] res2 = new int[3];
        for (int i = 0; i < s.length(); i++) {
            centre = i;
            left = centre;
            reight = centre;
            res = palindromeSize(reight, left, size, start, end, s);
            size = res[0];
            start = res[1];
            end = res[2];
            res2 = palindromeSize(reight + 1, left, size, start, end, s);
            if (res2[0] > size) {
                size = res2[0];
                start = res2[1];
                end = res2[2];
            }

        }

        return s.substring(start, end + 1);
    }

    private int[] palindromeSize(int reight, int left, int size, int start, int end, String s) {
        while (reight < s.length() && left >= 0 && isEquals(s.charAt(left), s.charAt(reight))) {
            if (size < reight - left + 1) {
                size = reight - left + 1;
                start = left;
                end = reight;
            }
            left--;
            reight++;
        }
        return new int[]{size, start, end};
    }

    private boolean isEquals(char left, char reight) {
        return left == reight;
    }
}
