public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int reight = s.length() - 1;
        while (left < reight) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(reight))) {
                reight--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(reight))) {
                return false;
            }
            left++;
            reight--;
        }
        return true;
    }
}
