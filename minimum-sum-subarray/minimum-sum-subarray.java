class Solution {
    public int minSubarraySum(int[] arr) {
        int curr_sum = 0, min_sum = Integer.MAX_VALUE;
        for(int num : arr) {
            curr_sum = Math.min((curr_sum + num), num);
            min_sum = Math.min(min_sum, curr_sum);
        }
        return min_sum;
    }
} 
