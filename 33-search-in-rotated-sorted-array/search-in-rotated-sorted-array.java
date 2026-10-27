class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        boolean isTargetInLeft = target <= nums[n];
        int s = 0, e = n;
        while(s <= e) {
            int m = s + (e - s)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                if(nums[m] > nums[n] && isTargetInLeft)
                    s = m + 1;
                else 
                    e = m - 1;
            } else {
                if(nums[m] <= nums[n] && !isTargetInLeft) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}