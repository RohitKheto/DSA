class Solution {
    private boolean isPossible(int[] nums, int k, long max) {
        long sum = 0;
        for(int num : nums) {
            if(sum + num > max) {
                k--;
                sum = 0;
                if(k <= 0) return false;
            }
            sum += num;
        }

        return true;
    }
    public int splitArray(int[] nums, int k) {
        long l = 0;
        long h = 0;
        for(int num : nums) {
            if(l < num) l = num;
            h += num;
        }
        long res = 0;
        while(l <= h) {
            long m = l + (h - l)/2;
            if(isPossible(nums,k,m)) {
                res = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (int)res;
    }
}