class Solution {
    private boolean isPossible(int[] weights, int days, int maxWeight) {
        int totalWeight = 0;
        for(int weight : weights) {
            if(totalWeight + weight > maxWeight) {
                days--;
                totalWeight = 0;
                if(days <= 0) return false;
            }
            totalWeight += weight;
        }

        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        for(int weight : weights) {
            if(l < weight) l = weight;
            h += weight;
        }
        int res = 0;
        while(l <= h) {
            int m = l + (h - l)/2;
            if(isPossible(weights,days,m)) {
                res = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }
}