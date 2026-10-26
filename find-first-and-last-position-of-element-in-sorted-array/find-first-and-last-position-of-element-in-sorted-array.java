class Solution {
    private int getPosition(int[] nums, int target,int pos) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                index = mid;
                if(pos == 0)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{getPosition(nums,target,0),getPosition(nums,target,1)};
    }
}
