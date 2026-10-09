class Solution {
    private int getSquareSum(int num) {
        int squareSum = 0;
        while(num != 0) {
            int digit = num % 10;
            squareSum += digit * digit;
            num /= 10;
        }
        return squareSum;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while(fast != 1) {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
            if(slow == fast && slow != 1)
                return false;
        }
        return true;
    }
}