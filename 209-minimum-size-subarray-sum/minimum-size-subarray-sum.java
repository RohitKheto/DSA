class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0, sum = 0, ans = nums.length+1;
        while(low <= high && high < nums.length) {
            sum += nums[high];
            if(sum < target) high++;
            else {
               ans = Math.min(ans, (high - low + 1));
               sum -= nums[low++];
               if(low <= high){
                    sum -= nums[high];
               }
            }
            
        }
        return (ans <= nums.length) ? ans : 0;
    }
}