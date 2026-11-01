class Solution {
    // Extracts the digit by shifting 'num' right 'x' times
    private int getDigit(long num, int x) {
        while (x > 0) {
            num /= 10;
            x--;
        }
        return (int) (num % 10);
    }

    public int findNthDigit(int n) {
        long base = 9;       // Count of numbers in current range (9, 90, 900...)
        int digitCount = 1;  // Number of digits per number (1, 2, 3...)
        long num = 0;        // Track last number of the previous range

        // 1. Find the digit-length range where the N-th digit lives
        while (n - (base * digitCount) > 0) {
            n -= base * digitCount;
            num += base;
            base *= 10;
            digitCount++;
        }

        // 2. Pinpoint the exact number
        num += n / digitCount;
        int rem = n % digitCount;

        // 3. Adjust for remainder and extract the digit
        if (rem != 0) {
            num += 1;
            rem = digitCount - rem; // Convert left-index to right-shift count
        }
        return getDigit(num, rem);
    }
}
