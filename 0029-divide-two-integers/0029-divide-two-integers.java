class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        // Determine sign
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        // Work with positive longs to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            // Double temp until it exceeds dvd
            while (dvd >= temp * 2) {
                temp *= 2;
                multiple *= 2;
            }

            dvd -= temp;
            result += multiple;
        }

        return sign == 1 ? result : -result;
    }
}