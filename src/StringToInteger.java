public class StringToInteger {
    public int myAtoi(String s) {
        int result = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int i = 0;
        char sign = '+';
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length()) {
            if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                sign = s.charAt(i);
                i++;
            }
        }
        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))){
                return result;
            }
            if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                if (sign == '-') {
                    if (result >= (min + digit) / 10) {
                        result = result * 10 - digit;
                    } else {
                        return min;
                    }
                }
                if (sign == '+') {
                    if (result <= (max - digit) / 10) {
                        result = result * 10 + digit;
                    } else {
                        return max;
                    }
                }
            }
            i++;
        }
        return result;
    }
}
