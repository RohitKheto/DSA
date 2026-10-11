class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curr_min = nums[0];
        int min = nums[0];
        int curr_max = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curr_max = Math.max(curr_max+nums[i] , nums[i]);
            curr_min = Math.min(curr_min+nums[i] , nums[i]);
            max = Math.max(curr_max , max);
            min = Math.min(curr_min , min);
        }

        return Math.max(max,-min);
    }
}