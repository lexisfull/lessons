public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else if (i > 0) {
                digits[i] = 0;
            }
            if (i == 0 && digits[0] >= 9) {
                digits[i] = 0;
                int[] array = new int[digits.length + 1];
                for (int j = array.length - 1; j >= 1; j--) {
                    array[j] = digits[j - 1];
                }
                array[0]++;
                return array;
            }
        }
        return digits;
    }
}
