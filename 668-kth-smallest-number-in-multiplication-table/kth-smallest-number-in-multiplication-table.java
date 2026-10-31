class Solution {
    private boolean isPossible(int m,int n, int k, int maxNumber) {
        int count = 0;
        for(int i = 1; i <= m; i++) {
            count += Math.min(maxNumber/i,n);
        }
        return (count >= k);
    }
    public int findKthNumber(int m, int n, int k) {
        int l = 1, h = m * n;
        int res = -1;
        while(l <= h) { //TC = O(log(m*n))
            int mid = (l + h)/2;
            if(isPossible(m,n,k,mid)) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}