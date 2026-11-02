public class MagicalString {

    public static void main(String... args) {
        System.out.println(magicalString(12));
    }

    public static int magicalString(int n) {
        StringBuilder s = new StringBuilder("122");
        int left = 0;
        int right = 2;
        int count = 1;
        while (s.length() < n) {
            for (int i = 0; i < s.charAt(right) - '0'; i++) {
                s.append(s.charAt(left));
                if (s.charAt(left) - '0' == 1) {
                    count++;
                }
                if (s.length() == n) {
                    return count;
                }
            }
            right++;
            left = 1 - left;
        }
        return count;
    }

}
