class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, low = 0, product = 1;

        for(int high = 0; high < nums.length; high++) {
            product *= nums[high];

            while(low <= high && product >= k) {
                product /= nums[low];
                low++;
            }

            count += high - low + 1;
        }


        return count;
    }
}