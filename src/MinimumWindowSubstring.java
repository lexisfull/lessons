public class MinimumWindowSubstring {
//    public String minWindow(String s, String t) {
//        if (t.length() > s.length()) {
//            return "";
//        }
//        int[] chars = new int[128];
//        int[] window = new int[128];
//        for (int i = 0; i < t.length(); i++) {
//            chars[t.charAt(i)]++;
//        }
//        int left = 0;
//        int reight = t.length() - 1;
//        int res = 0;
//        while (left < s.length() - 1 - t.length() - 1 ) {
//             for (int i = left; i <= reight; i++ ) {
//                 window[s.charAt(i)]++;
//             }
//
//        }
//    }
}
