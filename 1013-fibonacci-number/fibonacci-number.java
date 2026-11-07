class Solution {
    private int fibRecursion(int n) {
        if(n == 0 || n == 1)
            return n;
        return fibRecursion(n - 1) + fib(n - 2);
    }
    public int fib(int n) {
        return fibRecursion(n);
    }
}