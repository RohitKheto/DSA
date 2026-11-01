class Solution {
    private boolean isPossible(int[] price, int k, int minDiff) {
        int lastPrice = price[0];
        k--;
        for(int currPrice : price) {
            if(currPrice - lastPrice >= minDiff) {
                k--;
                if(k == 0) return true;
                lastPrice = currPrice;
            }
        }
        return false;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l = 0;
        int h = price[price.length - 1] - price[0];
        int res = 0;
        while(l <= h) {
            int m = l + (h - l)/2;
            if(isPossible(price,k,m)) {
                res = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return res;
    }
}