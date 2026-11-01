class Solution {
    private int nthDigit(long num,int x) {
        while(x > 0) {
            num /= 10;
            x--;
        }
        return (int)num % 10;
    }
    public int findNthDigit(int n) {
        long base = 9;
        int digitCount = 1;
        long num = 0;
        while(n - (base * digitCount) > 0) {
            n -= base * digitCount;
            num += base;
            base *= 10;
            digitCount++;
        }

        num += n/digitCount;
        int rem = n % digitCount;

        if(rem != 0) {
            num += 1;
            rem = digitCount - rem;
        }
        return nthDigit(num,rem);

    }
}