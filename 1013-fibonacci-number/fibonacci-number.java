class Solution {
    private int fibRecursion(int n) { // using recursion TC = O(n), SC = O(n)
        if(n == 0 || n == 1)
            return n;
        return fibRecursion(n - 1) + fib(n - 2);
    }
    private int fibDP(int n) { // using DP TC = O(n), SC = O(1)
        if(n == 0)
            return n;
        int prev = 0;
        int curr = 1;
        for(int i = 2; i <=n; i++) {
            curr += prev;
            prev = curr - prev;
        }
        return curr;
    }
    public int fib(int n) {
        // return fibRecursion(n);
        return fibDP(n);
    }
}