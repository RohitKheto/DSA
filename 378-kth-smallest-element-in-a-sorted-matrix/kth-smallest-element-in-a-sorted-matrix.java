class Solution {
    public boolean isKthSmallest(int[][] matrix, int k, int num) {
        int n = matrix.length;
        int r = n - 1;
        int c = 0;
        int count = 0;
        while(r > -1 && c < n) {
            if(matrix[r][c] <= num) {
                count += r + 1;
                c++;
            } else {
                r--;
            }
        }
        return (count >= k);
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0];
        int h = matrix[n - 1][n - 1];
        int res = 0;
        while(l <= h) {
            int m = l + (h - l)/2;
            if(isKthSmallest(matrix,k,m)) {
                res = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }
}
