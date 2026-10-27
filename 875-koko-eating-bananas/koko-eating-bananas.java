// answer will always range between 1 - max(piles)
// so we can use binary search and get no. of bananas/hour and divide it by all piles[i] and calculate total hours and determine is it closest to h or not
// time complexity = O(nlogm) where m = max(piles) and n = length of piles

class Solution {
    private int getMaximumPile(int[] piles) {
        int max = 0;
        for(int pile : piles) {
            if(pile > max) max = pile;
        }
        return max;
    }

    private long calculateRequiredHours(int[] piles, int m) {
        long totalHours = 0;
        for(int pile : piles) {
            totalHours += (pile + m - 1)/m;
        }
        return totalHours;
    }


    public int minEatingSpeed(int[] piles, int h) {
        //basic binary search algorithm
        int ans = 0;
        int s = 1, e = getMaximumPile(piles);
        while(s <= e) {
            int m = s + (e - s)/2;
            long hoursTaken = calculateRequiredHours(piles,m);
            if(hoursTaken <= h) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}
