class Solution {

    private boolean isPossible(int m, int n, int k, int x) {
        long count = 0;
        int max = Math.min(m, x);

        for (int i = 1; i <= max; i++) {
            count += Math.min(x / i, n);
            if (count >= k) {
                return true;
            }
        }

        return false;
    }

    public int findKthNumber(int m, int n, int k) {

        // Iterate over the smaller dimension
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        int l = 1;
        int h = k;  // Optimized upper bound

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (isPossible(m, n, k, mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}