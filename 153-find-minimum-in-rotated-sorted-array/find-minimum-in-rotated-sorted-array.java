class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int s = 0, e = n;
        while(s < e) {
            int m = s + (e - s)/2;
            if(nums[m] > nums[n]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return nums[s];
    }
}
